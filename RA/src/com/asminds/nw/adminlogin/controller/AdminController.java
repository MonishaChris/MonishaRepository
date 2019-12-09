package com.asminds.nw.adminlogin.controller;

import java.util.Iterator;
import java.util.List;

import org.hibernate.mapping.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
	
	@RequestMapping("/login")
	public String index() {
		System.out.println("i am in login page");
		return "loginpage";
	}
	
	@RequestMapping("/loginValidation")
	public String loginValidation(@ModelAttribute("t")AdminLogin user) {
		System.out.println("I am in login Validation");
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		return "home";
	}
	
	@RequestMapping("/signup")
	public String signup() {
		System.out.println("i am in signup page");
		return "register";
	}
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("I am in home page");
		return "home";
	}
	
	@RequestMapping("/Insert")
	public String insert(CustomerDetails s) {
		CustomerDaoImpl h=new CustomerDaoImpl();
		boolean n=h.insert(s);
		System.out.println("I am in insert method");
		if(n==true) {
			return "home";
		}
		else {
			return "loginpage";
		}	
	}
	
	@RequestMapping("/delete")
	public String delete(@ModelAttribute("t")CustomerDetails d) {
		CustomerDaoImpl h=new CustomerDaoImpl();
		boolean n=h.delete(d.getCustid());
		System.out.println("I am in delete method");
		if(n==true) {
			return "home";
		}
		else {
			return "loginpage";
		}
	}
	
	@RequestMapping("/update")
	public String update(@ModelAttribute("t")CustomerDetails ad) {
		CustomerDaoImpl h=new CustomerDaoImpl();
		boolean n=h.update(ad);
		System.out.println("I am in update method");
		if(n==true) {
			return "home";
		}
		else {
			return "loginpage";
		}
	}
	
	@RequestMapping("/viewall")
	public ModelAndView view()
	{
		System.out.println("View all methods");
		CustomerDaoImpl h=new CustomerDaoImpl();
		List<CustomerDetails> l=h.viewAll();
		Iterator<CustomerDetails> itr=l.iterator();
		while (itr.hasNext()) {
			Object o = (Object) itr.next();
			CustomerDetails p=(CustomerDetails)o;
			System.out.println("Customer Details are:" + p.getCustid()+" "+p.getCustname()+" "+p.getCustaddress()+" "+p.getCustcontact()+" "+p.getCustpackage()+" "+p.getOffer()+" "+p.getPlanyear()+" "+p.getAmount());
		}
		return new ModelAndView("viewpage", "monisha", l);
	}
	
	@RequestMapping("/back")
	public String back() {
		System.out.println("I am in back method");
		return "home";
		}
	@RequestMapping(value = "/loginValidation", method = RequestMethod.POST)
	public ModelAndView formvalidation(@ModelAttribute("user") AdminLogin user) {
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
