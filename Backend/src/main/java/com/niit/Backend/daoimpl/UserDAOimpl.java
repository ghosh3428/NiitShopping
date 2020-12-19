package com.niit.Backend.daoimpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Backend.dao.UserDAO;
import com.niit.Backend.dto.Address;
import com.niit.Backend.dto.Cart;
import com.niit.Backend.dto.User;



@Repository("userDAO")
@Transactional
public class UserDAOimpl implements UserDAO 
{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean addUser(User user) 
	{
		try 
		{			
			sessionFactory.getCurrentSession().persist(user);			
			return true;
		}
		catch(Exception ex) 
		{
			return false;
		}
	}

	@Override
	public boolean addAddress(Address address) 
	{
		
		try 
		{			
			sessionFactory.getCurrentSession().persist(address);			
			return true;
		}
		catch(Exception ex) 
		{
			return false;
		}
	}

	@Override
	public boolean addCart(Cart cart) 
	{
		
		try 
		{			
			sessionFactory.getCurrentSession().persist(cart);			
			return true;
		}
		catch(Exception ex) 
		{
			return false;
		}
	}

}
