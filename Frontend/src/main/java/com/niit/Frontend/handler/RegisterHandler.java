package com.niit.Frontend.handler;

import org.springframework.stereotype.Component;

import com.niit.Backend.dto.Address;
import com.niit.Backend.dto.User;
import com.niit.Frontend.model.RegisterModel;

@Component
public class RegisterHandler 
{
	
	public RegisterModel init() 
	{ 
		return new RegisterModel();
	}
	
	public void addUser(RegisterModel registerModel, User user) 
	{
		registerModel.setUser(user);
	}
	
	public void addBilling(RegisterModel registerModel, Address billing) 
	{
		registerModel.setBilling(billing);
	}

}
