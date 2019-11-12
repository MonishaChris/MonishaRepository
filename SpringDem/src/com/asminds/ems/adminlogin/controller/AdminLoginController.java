package com.asminds.ems.adminlogin.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminLoginController {	
	
	@RequestMapping("/login")
	public String index() {
		System.out.println("I am in login page");
		return "loginpage";
	}
	
	@RequestMapping("/loginValidation")
	public String loginValidation(@ModelAttribute("t") Adminloginbean loginBean) {
		System.out.println(" Im in loginValidation");
		System.out.println(loginBean.getPassword());
		System.out.println(loginBean.getUsername());
		return "home";

	}
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("I am in Insert method");
		return "home";
	}
	
	@RequestMapping("/Insert")
	public String insert( CrudPojo s) {
		StuDaoImpl l=new StuDaoImpl();
	boolean n=	l.insert(s);
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
	public String Delete(@ModelAttribute("s") CrudPojo a) {
		StuDaoImpl l = new StuDaoImpl();
		boolean n = l.delete(a.getStuid());
		System.out.println("I am in Delete method");
		if (n == true) {
			return "home";
		} else {
			return "loginpage";
		}
		}
	@RequestMapping("/update")
	public String update(@ModelAttribute("t") CrudPojo ad) {

		System.out.println(" Im in update method");

		StuDaoImpl a = new StuDaoImpl();
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
			StuDaoImpl s=new StuDaoImpl();
			List<CrudPojo> l=s.viewall();
			
			Iterator<CrudPojo> it=l.iterator();
			
		while(it.hasNext()) {
			
			Object o = (Object) it.next();
			CrudPojo p = (CrudPojo) o;
			System.out.println("Student Details : " + p.getStuid()+ " " +p.getStuaddress()+" " +p.getStuname());	
		}

			return new ModelAndView("viewpage" , "Monisha" ,l);
	}
		@RequestMapping("/back")
		public String back() {
			System.out.println("I am in Back method");
			return "home";
}
		@RequestMapping(value = "/loginValidation", method = RequestMethod.POST)
		public ModelAndView formvalidation(@ModelAttribute("user") Adminloginbean user) {
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
