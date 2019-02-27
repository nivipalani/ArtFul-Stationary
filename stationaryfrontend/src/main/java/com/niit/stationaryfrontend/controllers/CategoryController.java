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
@RequestMapping("/admin")
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
		model.addAttribute("edit", false);
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
			model.addAttribute("edit", false);

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
					model.addAttribute("edit", false);
				}
				else
				{
					model.addAttribute("catpage", true);
					model.addAttribute("mycategory", new Category());
					model.addAttribute("Error1", false);
					model.addAttribute("Success", false);
					model.addAttribute("Error2", false);
					model.addAttribute("category_list", categoryDao.selectAllCategory());
					model.addAttribute("Error3", true);
					model.addAttribute("edit", false);
				}
			} catch (Exception e) {
				model.addAttribute("catpage", true);
				model.addAttribute("mycategory", category);
				model.addAttribute("Error1", false);
				model.addAttribute("Success", false);
				model.addAttribute("Error2", true);
				model.addAttribute("category_list", categoryDao.selectAllCategory());
				model.addAttribute("Error3", false);
				model.addAttribute("edit", false);
			}

		}
		return "index";
	}
	
	@RequestMapping("/deleteCategory")
	String deleteCategoryPage(@RequestParam("catid")int cat_Id,Model model)
	{
		try
		{
			if(categoryDao.deleteCategory(categoryDao.selectOneCategory(cat_Id)))
			return "redirect:/category";
			else
			{
				model.addAttribute("catpage", true);
				model.addAttribute("mycategory", new Category());
				model.addAttribute("Error1", false);
				model.addAttribute("Success", false);
				model.addAttribute("Error2", false);
				model.addAttribute("category_list", categoryDao.selectAllCategory());
				model.addAttribute("Error3", true);
				model.addAttribute("edit", false);
				return "index";
			}
			
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
			model.addAttribute("edit", false);
			return "index";
			
		}
		
	}
	
	
	@RequestMapping("/editCategory")
	String editCategoryPage(@RequestParam("catid")int cat_Id,Model model) {
		model.addAttribute("catpage", true);
		model.addAttribute("mycategory", categoryDao.selectOneCategory(cat_Id));
		model.addAttribute("Error1", false);
		model.addAttribute("Success", false);
		model.addAttribute("Error2", false);
		model.addAttribute("category_list", categoryDao.selectAllCategory());
		model.addAttribute("Error3", false);
		model.addAttribute("edit", true);
		return "index";
	}
	
	@RequestMapping("/updateCategory")
	String updateCategoryPage(@Valid @ModelAttribute("mycategory") Category category, BindingResult bindingResult,
			Model model) {

		if (bindingResult.hasErrors()) {
			model.addAttribute("catpage", true);
			model.addAttribute("mycategory", category);
			model.addAttribute("Error1", true);
			model.addAttribute("Success", false);
			model.addAttribute("Error2", false);
			model.addAttribute("category_list", categoryDao.selectAllCategory());
			model.addAttribute("Error3", false);
			model.addAttribute("edit", false);

		}

		else {
			try {
				if (categoryDao.updateCategory(category)) {
					model.addAttribute("catpage", true);
					model.addAttribute("mycategory", new Category());
					model.addAttribute("Error1", false);
					model.addAttribute("Success", true);
					model.addAttribute("Error2", false);
					model.addAttribute("category_list", categoryDao.selectAllCategory());
					model.addAttribute("Error3", false);
					model.addAttribute("edit", false);
				}
				else
				{
					model.addAttribute("catpage", true);
					model.addAttribute("mycategory", new Category());
					model.addAttribute("Error1", false);
					model.addAttribute("Success", false);
					model.addAttribute("Error2", false);
					model.addAttribute("category_list", categoryDao.selectAllCategory());
					model.addAttribute("Error3", true);
					model.addAttribute("edit", false);
				}
			} catch (Exception e) {
				model.addAttribute("catpage", true);
				model.addAttribute("mycategory", category);
				model.addAttribute("Error1", false);
				model.addAttribute("Success", false);
				model.addAttribute("Error2", true);
				model.addAttribute("category_list", categoryDao.selectAllCategory());
				model.addAttribute("Error3", false);
				model.addAttribute("edit", false);
			}

		}
		return "index";
	}

	
	
}
