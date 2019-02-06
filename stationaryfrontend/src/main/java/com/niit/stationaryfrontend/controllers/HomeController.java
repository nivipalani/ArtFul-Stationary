package com.niit.stationaryfrontend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	String HomePage(Model model)
	{
		model.addAttribute("carousel",true);
		return "index";
	}
	
	@RequestMapping("/signin")
	String SignInPage(Model model)
	{
		model.addAttribute("signin",true);
		return "index";
	}
	
	@RequestMapping("/signup")
	String SignUpPage(Model model)
	{
		model.addAttribute("signup",true);
		return "index";
	}
	
	@RequestMapping("/contactus")
	String ContactUsPage(Model model)
	{
		model.addAttribute("contactus",true);
		return "index";
		
	}
	@RequestMapping("/aboutus")
	String AboutUsPage(Model model)
	{
		model.addAttribute("aboutus",true);
		return "index";
		
	}
	

}
