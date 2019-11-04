package com.asminds.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegistrationServlet extends HttpServlet {
	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String fn=request.getParameter("FirstName");
	String ln=request.getParameter("LastName");
	String father=request.getParameter("FatherName");
	String mother=request.getParameter("MotherName");
	String age=request.getParameter("Age");
	System.out.println(fn+" "+ln+" "+father+" "+mother+" "+age);
	}

	

}
