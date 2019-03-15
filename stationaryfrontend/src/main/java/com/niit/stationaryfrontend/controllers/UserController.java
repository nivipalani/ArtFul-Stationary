package com.niit.stationaryfrontend.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.stationarybackend.dao.UserDao;
import com.niit.stationarybackend.model.Category;
import com.niit.stationarybackend.model.User;

@Controller
public class UserController {
	
	@Autowired
	UserDao userDao;
	
	@RequestMapping("/signup")
	String userPage(Model model) {
		model.addAttribute("signup", true);
		model.addAttribute("myuser", new User());
		model.addAttribute("Success", false);
		model.addAttribute("Error1", false);
		model.addAttribute("Error2", false);//user already exists
		return "index";
	}
	
	
	
	@RequestMapping("/addUser")
	String addUserPage(@Valid @ModelAttribute("myuser") User user, BindingResult bindingResult,
			Model model) {

		if (bindingResult.hasErrors()) {
			model.addAttribute("signup", true);
			model.addAttribute("myuser", user);
			model.addAttribute("Success", false);
			model.addAttribute("Error1", true);
			model.addAttribute("Error2", false);//user already exists

		}

		else {
			try {
				if (userDao.createUser(user)) {
					model.addAttribute("signup", true);
					model.addAttribute("myuser", new User());
					model.addAttribute("Success", true);
					model.addAttribute("Error1", false);
					model.addAttribute("Error2", false); //user already exists
					
				}
				else
				{
					model.addAttribute("signup", true);
					model.addAttribute("myuser", new User());
					model.addAttribute("Success", false);
					model.addAttribute("Error1", true);
					model.addAttribute("Error2", false);//user already exists
				}
			} catch (Exception e) {
				model.addAttribute("signup", true);
				model.addAttribute("myuser", user);
				model.addAttribute("Success", false);
				model.addAttribute("Error1", false);
				model.addAttribute("Error2", true);//user already exists
				
			}

		}
		return "index";
	}

}
