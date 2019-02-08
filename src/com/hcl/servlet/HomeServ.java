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

public class HomeServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		Users user=new Users();
		//System.out.println(email+password+role);
		UserService service=new UserService();
		
		 if(email.equals("prags@hcl.com") && password.equals("1234"))
		{
			System.out.println("hello");
			HttpSession session = request.getSession(true);
			session.setAttribute("Admin", "Pragati");
			RequestDispatcher rd=request.getRequestDispatcher("AdminServ");
			rd.forward(request, response);
		}
		 else if(service.validateUser(email, password))//User
			{
				out.println("Authentication successful");
				HttpSession session = request.getSession(true);
				session.setAttribute("user", user);
				RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
				rd.forward(request, response);
			}
		else
		{
			out.println("<font color='red' size='5'><b>Invalid username or password.</b></font><br>");
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
		
		}

		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		doGet(request, response);
	}

}
