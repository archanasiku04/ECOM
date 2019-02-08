package com.hcl.hibernate;



import com.hcl.entity.Address;
import com.hcl.entity.Cart;
import com.hcl.entity.Category;
import com.hcl.entity.Order;
import com.hcl.entity.Products;
import com.hcl.entity.*;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;;



public class HibernateUtil {





	private static final SessionFactory sessionFactory = buildSessionFactory();


	private static SessionFactory buildSessionFactory() {
		try {
			SessionFactory factory=(SessionFactory) new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Address.class).addAnnotatedClass(Users.class)
					.addAnnotatedClass(Order.class).addAnnotatedClass(Cart.class).addAnnotatedClass(Products.class).addAnnotatedClass(Category.class).buildSessionFactory();
	
			return factory;
		}
		catch(Throwable ex)
		{
			System.err.println("SessionFactory creation failed"+ex);
			throw new ExceptionInInitializerError(ex);
		}




	}



	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}


}
