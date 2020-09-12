package com.niit.Frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FrontController 
{

	
	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index()
	{
		ModelAndView mav = new ModelAndView("page");
		
		mav.addObject("Message","Hello User!!! Welcome to Niit Shopping Website");
		return mav;
	}
}
