package com.hcl.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.hcl.entity.Category;
import com.hcl.service.CategoryService;


public class ShowCategory extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CategoryService service=new CategoryService();
		List<Category> list=service.display();
		request.setAttribute("listCategory", list);
		Iterator<Category> itr=list.iterator();
		String url="http://localhost:10023/ECommerce1/editCat.jsp?categoryId=";
		String url1="http://localhost:10023/ECommerce1/removeCat.jsp?categoryId=";
		String allcat="";
		
		while(itr.hasNext()){
			Category cat=itr.next();
			if(cat.getCatName() != null) {
            
				 allcat = allcat+ "<tr><td>"+cat.getCategoryId()+"</td><td>"+cat.getCatName()+"</td><td><a href='"+url+(cat.getCategoryId())+"'>Edit</a> | <a href='"+url1+(cat.getCategoryId())+"'>Delete</a></td></tr>";
		
			}
		}
		request.setAttribute("cats", allcat);
		request.getRequestDispatcher("category.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
