package com.asminds.hms.adminlogin.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HospitalController {
	
	@RequestMapping("/login")
	public String index() {
		System.out.println("i am in login page");
		return "loginpage";
	}
	@RequestMapping("/loginValidation")
	public String loginValidation(@ModelAttribute("t") HospitalLogin Login)
	{
		System.out.println("i am in home page");
		System.out.println(Login.getUsername());
		System.out.println(Login.getPassword());
		return "home";
	}
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("I am in home page");
		return "home";
	}
	
	@RequestMapping("/Insert")
	public String insert(HospitalPojo s) {
		HospitalDaoImpl h=new HospitalDaoImpl();
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
	public String delete(@ModelAttribute("t")HospitalPojo d) {
		HospitalDaoImpl h=new HospitalDaoImpl();
		boolean n=h.delete(d.getPatientid());
		System.out.println("I am in delete method");
		if(n==true) {
			return "home";
		}
		else {
			return "loginpage";
		}
	}
	
	@RequestMapping("/update")
	public String update(@ModelAttribute("t")HospitalPojo ad) {
		HospitalDaoImpl h=new HospitalDaoImpl();
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
		HospitalDaoImpl h=new HospitalDaoImpl();
		List<HospitalPojo> l=h.viewall();
		Iterator<HospitalPojo> itr=l.iterator();
		while (itr.hasNext()) {
			Object o = (Object) itr.next();
			HospitalPojo p=(HospitalPojo)o;
			System.out.println("Patient Details are:" + p.getPatientid()+" "+p.getPatientname()+" "+p.getAddress()+" "+p.getContact()+" "+p.getDisease()+" "+p.getDoctorid()+" "+p.getDoctorname());
		}
		return new ModelAndView("viewpage", "Monisha", l);
	}
	
	@RequestMapping("/back")
	public String back() {
		System.out.println("I am in back method");
		return "home";
		}
	@RequestMapping(value = "/loginValidation", method = RequestMethod.POST)
	public ModelAndView formvalidation(@ModelAttribute("user") HospitalLogin user) {
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