package com.hcl.service;

import com.hcl.entity.Category;
import com.hcl.entity.Products;
import com.hcl.entity.Users;

import java.util.List;
import java.util.Set;

import com.hcl.dao.UserDAO;

public class UserService {

	
	public boolean validateUser(String email,String password)
	{
		UserDAO edao=new UserDAO();
		return edao.validateUser(email, password);

	}
	
	public boolean addUser(String firstName, String lastName, String email, String password, String mobileNo)
	{
		UserDAO edao=new UserDAO();
		return edao.addUser(firstName,lastName,email,password,mobileNo);
	}
	
	
}
