package com.hcl.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hcl.entity.Users;
import com.hcl.service.UserService;


public class RegisterServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String contact=request.getParameter("conatct");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		//String role=request.getParameter("role");
		//String address=request.getParameter("address");
		
		Users user=new Users(fname,lname,email,password,contact);
		UserService service=new UserService();
		
		if(service.addUser(fname,lname,email,password,contact))
		{
			out.println("Insertion successful");
			HttpSession session = request.getSession(true);
			session.setAttribute("user", user);
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.forward(request, response);
		}
	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
