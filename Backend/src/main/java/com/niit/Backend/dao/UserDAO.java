package com.niit.Backend.dao;

import com.niit.Backend.dto.Address;
import com.niit.Backend.dto.Cart;
import com.niit.Backend.dto.User;

public interface UserDAO 
{

	boolean addUser(User user);
	
	boolean addAddress(Address address);
	
	boolean addCart(Cart cart);
}
