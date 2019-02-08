package com.hcl.service;

import java.util.List;

import com.hcl.dao.CategoryDAO;
import com.hcl.dao.CategoryDAO;
import com.hcl.entity.Category;

public class CategoryService {

	public boolean addCategory(String name, String desc)
	{
		CategoryDAO edao=new CategoryDAO();
		return edao.addCategory(name, desc);
		
	}
	
	public boolean deleteCategory(int cat_id)
	{
		CategoryDAO edao=new CategoryDAO();
		return edao.deleteCategory(cat_id);
	}
	
	public boolean updateCategory(int id,String name,String desc)
	{
		CategoryDAO edao=new CategoryDAO();
		return edao.updateCategory(id,name,desc);
	}
	
	public List<Category> display()
	{
		CategoryDAO edao=new CategoryDAO();
		List<Category> list=edao.display();
		return list;
	}
}
