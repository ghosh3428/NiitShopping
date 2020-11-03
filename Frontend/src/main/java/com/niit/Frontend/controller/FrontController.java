package com.niit.Frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.Backend.dao.CategoryDAO;
import com.niit.Backend.dto.Category;
import com.niit.Backend.dto.Product;



@Controller
public class FrontController 
{

	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index()
	{
		ModelAndView mav = new ModelAndView("page");
		mav.addObject("title", "Home");
		mav.addObject("ClickHome",true);
		mav.addObject("categories", categoryDAO.categoryList());
		return mav;
	}
	
	
	@RequestMapping(value="/about")
	public ModelAndView about()
	{
		ModelAndView mav = new ModelAndView("page");
		mav.addObject("title", "About Us");
		mav.addObject("ClickAbout",true);
		return mav;
	}
	
	@RequestMapping(value="/contact")
	public ModelAndView contact()
	{
		ModelAndView mav = new ModelAndView("page");
		mav.addObject("title", "Contact Us");
		mav.addObject("ClickContact",true);
		return mav;
	}
	
	@RequestMapping(value = "/show/all/products")
	public ModelAndView showAllProducts() 
	{		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("title","All Products");
		mv.addObject("categories", categoryDAO.categoryList());
		mv.addObject("userClickAllProducts",true);
		return mv;				
	}	
	
	@RequestMapping(value = "/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) 
	{		
		ModelAndView mv = new ModelAndView("page");
		Category category = null;
		category = categoryDAO.getCategory(id);
		mv.addObject("title",category.getName());
		mv.addObject("categories", categoryDAO.categoryList());
		mv.addObject("category", category);
		mv.addObject("userClickCategoryProducts",true);
		return mv;				
	}	
	
	

	

	
}
