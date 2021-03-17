package com.niit.Backend.dao;

import java.util.List;

import com.niit.Backend.dto.Address;
import com.niit.Backend.dto.Cart;
import com.niit.Backend.dto.User;

public interface UserDAO 
{

	boolean addUser(User user);
	
	boolean addAddress(Address address);
	
	boolean updateCart(Cart cart);
	
	User getByEmail(String email) ;
	
	Address getBillingAddress(int userId);
	
	List<Address> listShippingAddresses(int userId);
	
	Address getAddress(int addressId);
}
