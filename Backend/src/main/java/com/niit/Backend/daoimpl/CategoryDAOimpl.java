package com.niit.Backend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.Backend.dao.CategoryDAO;
import com.niit.Backend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOimpl implements CategoryDAO 
{
	
	private static List<Category> categories = new ArrayList<>();
	
	static
	{
	
		Category ct = new Category();
		
		// First Categories
		ct.setId(1);
		ct.setName("Phone");
		ct.setDesc("Some Discription about Phone category.");
		ct.setImageurl("CAT_1.jpg");
		categories.add(ct);
		
		// Second Categories
		ct = new Category();	
		ct.setId(2);
		ct.setName("Laptop");
		ct.setDesc("Some Discription about Laptop category.");
		ct.setImageurl("CAT_2.jpg");
		categories.add(ct);
		
		// Third Categories
		ct = new Category();	
		ct.setId(3);
		ct.setName("Tv");
		ct.setDesc("Some Discription about Tv category.");
		ct.setImageurl("CAT_3.jpg");
		categories.add(ct);
		
		// Fourth Categories
		ct = new Category();	
		ct.setId(4);
		ct.setName("Desktop");
		ct.setDesc("Some Discription about Desktop category.");
		ct.setImageurl("CAT_4.jpg");
		categories.add(ct);
	}

	public List<Category> categoryList() 
	{
		
		return categories;
	}

}
