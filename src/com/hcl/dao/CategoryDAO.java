package com.hcl.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hcl.entity.Category;
import com.hcl.hibernate.HibernateUtil;

public class CategoryDAO {

	
	public boolean addCategory(String name, String desc)
	{
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		Category cat=new Category(name,desc);
		Object obj=session.save(cat);
		session.getTransaction().commit();
		
		if(obj!=null)
			return true;
		return false;
	}//addUser
	  
	public boolean deleteCategory(int catId)
	{
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		
		String hql="delete from Category where categoryId= :catId";
		Query query=session.createQuery(hql);
		query.setParameter("catId", catId);
		int rows=query.executeUpdate();
		
		if(rows>0)
		{
			System.out.println("Deleted "+rows+"rows");
			return true;
		}
		return false;
		
		
			
	}//delete Category
	
	public boolean updateCategory(int id,String name,String desc)
	{
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		
		String hql="update Category set catName =:name , catDesc =:desc where categoryId=:id";
		Query query=session.createQuery(hql);
		query.setParameter("catId", id);
		query.setParameter("name", name);
		query.setParameter("desc", desc);
		int rows=query.executeUpdate();
		
		if(rows>0)
		{
			System.out.println("Updated "+rows+"rows");
			return true;
		}
		return false;
		
		
			
	}//delete Category
    			
    	public List<Category> display()
    	{
    		String hql="from Category";
    		SessionFactory factory=HibernateUtil.getSessionFactory();
    		Session session=factory.getCurrentSession();
    		session.beginTransaction();
    		
    		Query query=session.createQuery(hql);
    		List<Category> list=query.list();
    		
    		return list;
    		
    	}
}
