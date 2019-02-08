package com.hcl.dao;

import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.hcl.entity.*;
import com.hcl.hibernate.HibernateUtil;

public class UserDAO {

	
	


	public boolean addUser(String firstName, String lastName, String email, String password, String mobileNo)
	{
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		Users user=new Users(firstName,lastName,email,password,mobileNo);
		Object obj=session.save(user);
		session.getTransaction().commit();
		
		if(obj!=null)
			return true;
		return false;
	}//addUser
	
	public boolean validateUser(String email,String password)
	{
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.getCurrentSession();
		session.beginTransaction();
		
		//Users user=new Users();

		String hql="from Users where email like :em and password like :ps";
		//System.out.println(user);
		Query query=session.createQuery(hql);
		query.setParameter("em", email);
		query.setParameter("ps", password);
		List<Users> lstUsers = query.list();
		System.out.println(lstUsers.size() + " Here 2");
		if(lstUsers.size() > 0)
			return true;		
		return false;
		
		
	}
	
	
}
