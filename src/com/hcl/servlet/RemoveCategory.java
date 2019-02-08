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

/**
 * Servlet implementation class RemoveCategory
 */
public class RemoveCategory extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemoveCategory() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
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
		
		
	
		int id=Integer.parseInt(request.getParameter("id"));
		Category cat=new Category();

		if(service.deleteCategory(id))
			request.setAttribute("msg", "Category Deleted!!!");
			request.getRequestDispatcher("removeCat.jsp").forward(request, response);
	
	}

}
