package com.hcl.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hcl.entity.Category;
import com.hcl.service.CategoryService;
import com.hcl.service.UserService;


public class AddCategory extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setAttribute("msg", "");
		request.getRequestDispatcher("addCategory.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		HttpSession session = request.getSession(true);
		session.getAttribute("Admin");
		CategoryService service=new CategoryService();
		
		
		String name=request.getParameter("name");
		String desc=request.getParameter("desc");
		Category cat=new Category(name,desc);

		if(service.addCategory(name, desc))
			request.setAttribute("msg", "Category Added!!!");
			request.getRequestDispatcher("addCategory.jsp").forward(request, response);
	}

}
