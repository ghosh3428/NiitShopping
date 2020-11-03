$(function() {

	switch (menu) {

	case 'About Us':
		$('#about').addClass('active');
		break;
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	case 'All Products':
		$('#listProducts').addClass('active');
		break;
	default:
		if (menu == "Home")
			break;
		$('#listProducts').addClass('active');
		break;
	}

	var products = [ [ 1, "TV" ], [ 2, "SMARTPHONE" ], [ 3, "MUSIC PLAYER" ],
			[ 4, "LAPTOP" ], [ 5, "DESKTOP" ], [ 6, "TABLET" ], [ 7, "AC" ],
			[ 8, "FRIDGE" ], [ 9, "SMART TV" ], [ 10, "TELEPHONE" ], ];

	var $table = $('#productTable');

	if ($table.length) {
		var jsonUrl = '';
		if (window.categoryId == '') {
			jsonUrl = window.contextRoot + '/json/data/all/products';
		} else {
			jsonUrl = window.contextRoot + '/json/data/category/'
					+ window.categoryId + '/products';
		}

		$table.DataTable({
			lengthMenu : [ [ 3, 5, 10, -1 ],
					[ '3 Records', '5 Records', '10 Records', 'ALL' ] ],
			pageLength : 5,
			ajax : {
				url : jsonUrl,
				dataSrc : ''
			},
			columns : [
					{
						data : 'code',
						bSortable : false,
						mRender : function(data, type, row) 
						{

							return '<img src="' + window.contextRoot
									+ '/rs/images/' + data
									+ '.png" class="dataTableImg"/>';

						}
					},

					{
						data : 'name'
					}, {
						data : 'brand'
					}, {
						data : 'unitPrice',
						mRender : function(data, type, row) {
							return '&#8377; ' + data
						}
					}, {
						data : 'quantity',
					},
					{
						data : 'id',
						bSortable : false,
						mRender : function(data, type, row)
						{

							var str = '';
							str += '<a href="' + window.contextRoot+ '/show/'+ data+ '/product" class="btn btn-primary"><span class="glyphicon glyphicon-eye-open"></span></a> &#160;';
							str += '<a href="' + window.contextRoot+ '/cart/add/'+ data+ '/product" class="btn btn-success"><span class="glyphicon glyphicon-shopping-cart"></span></a>';
							
							
							return str;

						}
					}

			]
		});
	}

});
