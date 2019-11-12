package com.asminds.vms.adminlogin.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class VehicleLoginController {
	
	@RequestMapping("/login")
	public String index() {
		System.out.println("I am in login page");
		return "loginpage";
	}
	@RequestMapping("/loginValidation")
	public String loginValidation(@ModelAttribute("t")VehicleAdminlogin Adminlogin) {
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
	public String insert( VehiclePojo s) {
		VehicleDaoimpl l=new VehicleDaoimpl();
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
	public String Delete(@ModelAttribute("s") VehiclePojo a) {
		VehicleDaoimpl l = new VehicleDaoimpl();
		boolean n = l.delete(a.getVehicleid());
		System.out.println("I am in Delete method");
		if (n == true) {
			return "home";
		} else {
			return "loginpage";
		}
		}
	@RequestMapping("/update")
	public String update(@ModelAttribute("t") VehiclePojo ad) {

		System.out.println(" Im in update method");

		VehicleDaoimpl a = new VehicleDaoimpl();
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
			VehicleDaoimpl s=new VehicleDaoimpl();
			List<VehiclePojo> l=s.viewall();
			
			Iterator<VehiclePojo> it=l.iterator();
			
		while(it.hasNext()) {
			
			Object o = (Object) it.next();
			VehiclePojo p = (VehiclePojo) o;
			System.out.println("Vehicle Details : " + p.getVehicleid()+ " " +p.getVehiclename()+" " +p.getModel()+" "+p.getManufacturedyear()+" "+p.getColor()+" "+p.getCost());	
		}

			return new ModelAndView("viewpage" , "Monisha" ,l);
	}
		@RequestMapping("/back")
		public String back() {
			System.out.println("I am in Back method");
			return "home";
}
		@RequestMapping(value = "/loginValidation", method = RequestMethod.POST)
		public ModelAndView formvalidation(@ModelAttribute("user") VehicleAdminlogin user) {
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
