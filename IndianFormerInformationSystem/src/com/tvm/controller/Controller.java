package com.tvm.controller;

import java.util.Iterator;
import java.util.List;

import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.tvm.model.repository.Transport;
import com.tvm.model.service.TransportServiceImpl;

@org.springframework.stereotype.Controller
public class Controller {
	
	/*@RequestMapping("/registersavetransport")
	public String submitForm(@Valid @ModelAttribute("ifis") Transport e,BindingResult br)
	{
		if(br.hasErrors())
		{
			return "transportpage";
		}
		else
		{
			return "index";
		}
	}*/
	
	@RequestMapping("/home")
	public String index1() {
		System.out.println("I am in Home Page");
		return "index";
		}
	/*@RequestMapping("/transport")
	public String transport() {
		System.out.println("I am in transport Page");
		return "transportpage";
		}*/
	@RequestMapping("/transport")
	public String transport(Model m) {
		System.out.println("I am in transport Page");
		m.addAttribute("ifis", new Transport());
		return "transportpage";
		}
		@RequestMapping("/adminpage")
		public String adminpage() {
			System.out.println("I am in goback page");
			return "index";	}
		
		
		/*@RequestMapping("/registersavetransport")
		public String add(com.tvm.model.repository.Transport s) {
			TransportServiceImpl l=new TransportServiceImpl();
		boolean n= l.add(s);
		System.out.println("I am in Transport save method");
		if(n==true) {
			return "transportpage";
		}
		else 
		{
			return"index"; 
		}
		}	*/	
		
		@RequestMapping("/registersavetransport")
		public String add(@Valid @ModelAttribute("ifis")Transport s,BindingResult br) {
			if(br.hasErrors())
			{
				return "transportpage";
			}
			else {
			TransportServiceImpl l=new TransportServiceImpl();
		boolean n= l.add(s);
		System.out.println("I am in Transport save method");
		if(n==true) {
			return "transportpage";
		}
		else 
		{
			return"index"; 
		}
		}	}
		@RequestMapping("/viewall")
		public ModelAndView view()
		{
			System.out.println("View all method");
			TransportServiceImpl s=new TransportServiceImpl();
			List<Transport> l=s.view();
			
			Iterator<Transport> it=l.iterator();
			
		while(it.hasNext()) {
			
			Object o = (Object) it.next();
			Transport p = (Transport) o;
			System.out.println("Transport Details : " + p.getId()+" "+p.getDrivername()+" "+p.getVehicletype()+" "+p.getMobile()+" "+p.getLocation()+" "+p.getCity()+" "+p.getPincode()+" "+p.getStreet()+" "+p.getState());	
		}

			return new ModelAndView("viewpage" , "Monisha" ,l);
	}
		@RequestMapping("/updatelink")
		public ModelAndView updatelink(@ModelAttribute("test") Transport emp) {
			TransportServiceImpl update = new TransportServiceImpl();
			List<Transport> employeeList = update.updatebyid(emp.getId());
			return new ModelAndView("updateByid", "viewList", employeeList);
		}
		@RequestMapping("/update")
		public String update(@ModelAttribute("test") Transport emp) {

			TransportServiceImpl update = new TransportServiceImpl();
			int result= update.updatenewvalues(emp);
			if(result!=0) {
				return "redirect:transport";
			}else {
				System.out.println("Not Updated");
				return "redirect:transport";
			}
			
		}
		@RequestMapping("/deletebyid")
		public String deletebyid(@ModelAttribute("test") Transport emp) {

			TransportServiceImpl delete = new TransportServiceImpl();
			int b = delete.deletebyid(emp.getId());
			if(b!=0) {
				return "redirect:transport";
			}else {
				System.out.println("Not Deleted");
				return "redirect:transport";
			}
		}
		
		@RequestMapping("/back")
		public String back() {
			System.out.println("I am in Back method");
			return "transportpage";
		}
}
