package com.asminds.bms.adminlogin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
	@Controller
	public class AdminLoginController {

		@RequestMapping("/")
		public String indexMethod() {
			System.out.println(" Im in Index page");

			return "index";

		}
		@RequestMapping("/login")
		public String index() {
			System.out.println(" Im in Index page");

			return "loginpage";
		}

		@RequestMapping("/loginValidation")
		public String loginValidation(@ModelAttribute("t") Adminloginbean loginBean) {
			System.out.println(" Im in loginValidation");
			System.out.println(loginBean.getPassword());
			System.out.println(loginBean.getUsername());
			return "home";

		}
	}
