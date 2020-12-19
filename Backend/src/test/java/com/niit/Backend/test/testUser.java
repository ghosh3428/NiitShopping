package com.niit.Backend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Backend.dao.UserDAO;
import com.niit.Backend.dto.Address;
import com.niit.Backend.dto.Cart;
import com.niit.Backend.dto.User;

public class testUser 
{
private static AnnotationConfigApplicationContext context;
	
	private static UserDAO userDAO;
	
	private User user;
	private Address address;
	private Cart cart;
	
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.Backend");
		context.refresh();
		
		userDAO = (UserDAO)context.getBean("userDAO");
		
	}
	
	/*
	@Test
	public void testAddUser() 
	{
		
		user = new User() ;
		user.setFirstName("Anil");
		user.setLastName("Kumar");
		user.setEmail("ak@gmail.com");
		user.setContactNumber("1234512345");
		user.setRole("CUSTOMER");
		user.setEnabled(true);
		user.setPassword("12345");
		
		
		assertEquals("Failed to add the user!", true, userDAO.addUser(user));	
	}
	*/
	
	
	@Test
	public void testAddUser() 
	{
		
		
		address = new Address();
		address.setAddressLineOne("101/B Jadoo Society, Krissh Nagar");
		address.setAddressLineTwo("Near Kaabil Store");
		address.setCity("Mumbai");
		address.setState("Maharashtra");
		address.setCountry("India");
		address.setPostalCode("400001");
		address.setBilling(true);
		
		
		address.setUserId(36);
		
			
		assertEquals("Failed to add the billing address!", true, userDAO.addAddress(address));
		
	}
	/*
	@Test
	public void testAddUser() 
	{
		
		cart = new Cart();
		
		cart.setUserId(user.getId());
		
		assertEquals("Failed to add cart!", true, userDAO.addCart(cart));

				
		
	}
	
	@Test
	public void testAddUser() 
	{
		address = new Address();
		address.setAddressLineOne("201/B Jadoo Society, Kishan Kanhaiya Nagar");
		address.setAddressLineTwo("Near Kudrat Store");
		address.setCity("Mumbai");
		address.setState("Maharashtra");
		address.setCountry("India");
		address.setPostalCode("400001");
		address.setShipping(true);
		address.setUserId(user.getId());
		
		assertEquals("Failed to add the shipping address!", true, userDAO.addAddress(address));
		
	}
	
	*/
	

}
