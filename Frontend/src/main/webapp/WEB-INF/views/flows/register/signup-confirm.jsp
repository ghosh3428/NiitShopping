<%@include file="../flows-shared/header.jsp" %>
<div class="container">
	
	<div class="row">
	
		<div class="col-md-6">
	
			<div class="card">
				
				<div class="card-heading bg-primary text-white">
					<h4>Personal Details</h4>
				</div>
			
				<div class="card-body">
					<div class="text-center">
						<p>
							<a href="${flowExecutionUrl}&_eventId_personal" class="btn btn-primary">Edit</a>
						</p>
					</div>
				</div>
			
			</div>
					
		
		</div>
		
		<div class="col-md-6">
		
			<div class="card">
				
				<div class="card-heading bg-primary text-white">
					<h4>Billing Address</h4>
				</div>
			
				<div class="card-body">
					<div class="text-center">
						<p>
							<a href="${flowExecutionUrl}&_eventId_billing" class="btn btn-primary">Edit</a>
						</p>
					</div>
				</div>
			
			</div>
		
		</div>
	
	</div>
	<br/>
	<div class="row">
		
		<div class="offset-md-5 col-md-2">
			
			<div class="text-center">
				
				<a href="${flowExecutionUrl}&_eventId_success" class="btn btn-lg btn-primary">Confirm</a>
				
			</div>
			
		</div>
		
	</div>

</div>
<%@include file="../flows-shared/footer.jsp"%>