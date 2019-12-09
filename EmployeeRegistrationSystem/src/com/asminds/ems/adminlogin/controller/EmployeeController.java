package com.asminds.ems.adminlogin.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeDaoImpl t;
	
	@RequestMapping("/login")
	public String index() {
		System.out.println("I am in login page");
		return "loginpage";
	}
	
	@RequestMapping("/loginValidation")
	public String loginValidation(@ModelAttribute("t")EmployeeLogin Adminlogin) {
		System.out.println("I am in loginValidation");
		System.out.println(Adminlogin.getUsername());
		System.out.println(Adminlogin.getPassword());
		return "home";
		
	}
	@RequestMapping("/home")
	public String home() {
		System.out.println("I am in home page");
		return "home";
	}
	
	@RequestMapping("/Insert")
	public String insert( EmployeePojo s) {
		EmployeeDaoImpl l=new EmployeeDaoImpl();
	boolean n=	t.insert(s);
	System.out.println("I am in Insert method");
	if(n==true) {
		return "home";
	}
	else 
	{
		return"loginpage"; 
	}
	}
	
	@RequestMapping("/delete")
	public String Delete(@ModelAttribute("s") EmployeePojo a) {
		EmployeeDaoImpl l = new EmployeeDaoImpl();
		boolean n = t.delete(a.getEmpid());
		System.out.println("I am in Delete method");
		if (n == true) {
			return "home";
		} else {
			return "loginpage";
		}
		}
	@RequestMapping("/update")
	public String update(@ModelAttribute("t") EmployeePojo ad) {

		System.out.println(" Im in update method");

		EmployeeDaoImpl a = new EmployeeDaoImpl();
		boolean b = a.update(ad);
		if (b == true) {

			return "home";
		} else {
			return "loginpage";
		}

	}

		@RequestMapping("/viewall")
		public ModelAndView view()
		{
			System.out.println("View all method");
			EmployeeDaoImpl s=new EmployeeDaoImpl();
			List<EmployeePojo> l=s.viewall();
			
			Iterator<EmployeePojo> it=l.iterator();
			
		while(it.hasNext()) {
			
			Object o = (Object) it.next();
			EmployeePojo p = (EmployeePojo) o;
			System.out.println("Employee Details : " + p.getEmpid()+ " " +p.getEmpfirstname()+" " +p.getEmplastname()+" "+p.getEmpusername()+" "+p.getEmppassword()+" "+p.getEmpaddress()+" "+p.getEmpcontact());	
		}

			return new ModelAndView("viewpage" , "Monisha" ,l);
	}
		@RequestMapping("/back")
		public String back() {
			System.out.println("I am in Back method");
			return "home";
}
		@RequestMapping(value = "/loginValidation", method = RequestMethod.POST)
		public ModelAndView formvalidation(@ModelAttribute("user") EmployeeLogin user) {
			String username = user.getUsername();
			String password = user.getPassword();
			String wrong="Sorry! Invalid Username or Password...";
			if (username.equals("admin") && password.equals("123")) {
				return new ModelAndView("home");
			} else {
				return new ModelAndView("loginpage","wrong",wrong);
			}
		}
}
