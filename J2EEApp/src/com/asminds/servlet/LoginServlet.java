package com.asminds.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("username");
		String pass = request.getParameter("password");
		if(name.equals("admin")&&pass.equals("123")) {
			response.sendRedirect("register.jsp");
			
		}
		else {
			response.sendRedirect("error.jsp");
		}
		
	}

}
