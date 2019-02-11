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
	String categoryPage(Model model) {
		model.addAttribute("signup", true);
		model.addAttribute("myuser", new User());
		model.addAttribute("Success", false);
		model.addAttribute("Error1", false);
		model.addAttribute("Error2", false);
		return "index";
	}
	
	
	@RequestMapping("/addUser")
	String addCategoryPage(@Valid @ModelAttribute("myuser") User user, BindingResult bindingResult,
			Model model) {

		if (bindingResult.hasErrors()) {
			model.addAttribute("signup", true);
			model.addAttribute("myuser", user);
			model.addAttribute("Success", false);
			model.addAttribute("Error1", true);
			model.addAttribute("Error2", false);

		}

		else {
			try {
				if (userDao.createUser(user)) {
					model.addAttribute("signup", true);
					model.addAttribute("myuser", new Category());
					model.addAttribute("Success", true);
					model.addAttribute("Error1", false);
					model.addAttribute("Error2", false);
					
				}
				else
				{
					model.addAttribute("signup", true);
					model.addAttribute("myuser", new Category());
					model.addAttribute("Success", false);
					model.addAttribute("Error1", true);
					model.addAttribute("Error2", false);
				}
			} catch (Exception e) {
				model.addAttribute("signup", true);
				model.addAttribute("myuser", user);
				model.addAttribute("Success", false);
				model.addAttribute("Error1", false);
				model.addAttribute("Error2", true);
				
			}

		}
		return "index";
	}


}
