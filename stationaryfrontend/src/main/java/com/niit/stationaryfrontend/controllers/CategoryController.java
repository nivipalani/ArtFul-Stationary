package com.niit.stationaryfrontend.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.stationarybackend.dao.CategoryDao;
import com.niit.stationarybackend.model.Category;

@Controller
public class CategoryController {

	@Autowired
	CategoryDao categoryDao;

	@RequestMapping("/category")
	String categoryPage(Model model) {
		model.addAttribute("catpage", true);
		model.addAttribute("mycategory", new Category());
		model.addAttribute("Error1", false);
		model.addAttribute("Success", false);
		model.addAttribute("Error2", false);
		model.addAttribute("category_list", categoryDao.selectAllCategory());
		model.addAttribute("Error3", false);
		return "index";
	}

	// @RequestMapping("/addCategory")
	// String insertCategory(@ModelAttribute("mycategory")Category
	// category,Model model)
	// {
	// categoryDao.createCategory(category);
	// model.addAttribute("catpage", true);
	// return "index";
	// }

	@RequestMapping("/addCategory")
	String insertCategoryPage(@Valid @ModelAttribute("mycategory") Category category, BindingResult bindingResult,
			Model model) {

		if (bindingResult.hasErrors()) {
			model.addAttribute("catpage", true);
			model.addAttribute("mycategory", category);
			model.addAttribute("Error1", true);
			model.addAttribute("Success", false);
			model.addAttribute("Error2", false);
			model.addAttribute("category_list", categoryDao.selectAllCategory());
			model.addAttribute("Error3", false);

		}

		else {
			try {
				if (categoryDao.createCategory(category)) {
					model.addAttribute("catpage", true);
					model.addAttribute("mycategory", new Category());
					model.addAttribute("Error1", false);
					model.addAttribute("Success", true);
					model.addAttribute("Error2", false);
					model.addAttribute("category_list", categoryDao.selectAllCategory());
					model.addAttribute("Error3", false);
				}
			} catch (Exception e) {
				model.addAttribute("catpage", true);
				model.addAttribute("mycategory", category);
				model.addAttribute("Error1", false);
				model.addAttribute("Success", false);
				model.addAttribute("Error2", true);
				model.addAttribute("category_list", categoryDao.selectAllCategory());
				model.addAttribute("Error3", false);
			}

		}
		return "index";
	}
	
	@RequestMapping("/deleteCategory")
	String deleteCategoryPage(@RequestParam("catid")int cat_Id,Category category,Model model)
	{
		try
		{
			categoryDao.deleteCategory(category);
			return "index";
			
		}
		catch(Exception e)
		{
			model.addAttribute("catpage", true);
			model.addAttribute("mycategory", new Category());
			model.addAttribute("Error1", false);
			model.addAttribute("Success", false);
			model.addAttribute("Error2", false);
			model.addAttribute("category_list", categoryDao.selectAllCategory());
			model.addAttribute("Error3", true);
			return "index";
			
		}
		
	}

}
