package com.niit.stationaryfrontend.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.stationarybackend.dao.SupplierDao;
import com.niit.stationarybackend.model.Supplier;

@Controller
public class SupplierController {

	@Autowired
	SupplierDao supplierDao;

	@RequestMapping("/supplier")
	String categoryPage(Model model) {
		model.addAttribute("supplierpage", true);
		model.addAttribute("mysupplier", new Supplier());
		model.addAttribute("Error1", false);
		model.addAttribute("Success", false);
		model.addAttribute("Error2", false);
		model.addAttribute("supplier_list", supplierDao.selectAllSupplier());
		model.addAttribute("Error3", false);
		model.addAttribute("edit", false);
		return "index";
	}



	@RequestMapping("/addSupplier")
	String insertSupplierPage(@Valid @ModelAttribute("mysupplier") Supplier supplier, BindingResult bindingResult,
			Model model) {

		if (bindingResult.hasErrors()) {
			System.out.println(bindingResult.toString());
			model.addAttribute("supplierpage", true);
			model.addAttribute("mysupplier", supplier);
			model.addAttribute("Error1", true);
			model.addAttribute("Success", false);
			model.addAttribute("Error2", false);
			model.addAttribute("supplier_list", supplierDao.selectAllSupplier());
			model.addAttribute("Error3", false);
			model.addAttribute("edit", false);

		}
		else {
			try {
				if (supplierDao.createSupplier(supplier)) {
					model.addAttribute("supplierpage", true);
					model.addAttribute("mysupplier", new Supplier());
					model.addAttribute("Error1", false);
					model.addAttribute("Success", true);
					model.addAttribute("Error2", false);
					model.addAttribute("supplier_list", supplierDao.selectAllSupplier());
					model.addAttribute("Error3", false);
					model.addAttribute("edit", false);
				}
				else
				{
					model.addAttribute("supplierpage", true);
					model.addAttribute("mysupplier", new Supplier());
					model.addAttribute("Error1", false);
					model.addAttribute("Success", false);
					model.addAttribute("Error2", false);
					model.addAttribute("supplier_list", supplierDao.selectAllSupplier());
					model.addAttribute("Error3", true);
					model.addAttribute("edit", false);
				}
			} catch (Exception e) {
				model.addAttribute("supplierpage", true);
				model.addAttribute("mysupplier", supplier);
				model.addAttribute("Error1", false);
				model.addAttribute("Success", false);
				model.addAttribute("Error2", true);
				model.addAttribute("supplier_list", supplierDao.selectAllSupplier());
				model.addAttribute("Error3", false);
				model.addAttribute("edit", false);
			}

		}
		return "index";
	}
	
	@RequestMapping("/deleteSupplier")
	String deleteSupplierPage(@RequestParam("supid")int sup_Id,Model model)
	{
		try
		{
			if(supplierDao.deleteSupplier(supplierDao.selectOneSupplier(sup_Id)))			
			return "redirect:/supplier";			
			else
			{
				model.addAttribute("supplierpage", true);
				model.addAttribute("mysupplier", new Supplier());
				model.addAttribute("Error1", false);
				model.addAttribute("Success", false);
				model.addAttribute("Error2", false);
				model.addAttribute("supplier_list", supplierDao.selectAllSupplier());
				model.addAttribute("Error3", true);
				model.addAttribute("edit", false);
				return "index";
			}			
		}
		catch(Exception e)
		{
			model.addAttribute("supplierpage", true);
			model.addAttribute("mysupplier", new Supplier());
			model.addAttribute("Error1", false);
			model.addAttribute("Success", false);
			model.addAttribute("Error2", false);
			model.addAttribute("supplier_list", supplierDao.selectAllSupplier());
			model.addAttribute("Error3", true);
			model.addAttribute("edit", false);
			return "index";
			
		}
		
	}
	
	
	@RequestMapping("/editSupplier")
	String editSupplierPage(@RequestParam("supid")int sup_Id, Model model) {
		model.addAttribute("supplierpage", true);
		model.addAttribute("mysupplier", supplierDao.selectOneSupplier(sup_Id));
		model.addAttribute("Error1", false);
		model.addAttribute("Success", false);
		model.addAttribute("Error2", false);
		model.addAttribute("supplier_list", supplierDao.selectAllSupplier());
		model.addAttribute("Error3", false);
		model.addAttribute("edit", true);
		return "index";
	}
	
	
	@RequestMapping("/updateSupplier")
	String updateSupplierPage(@Valid @ModelAttribute("mysupplier") Supplier supplier, BindingResult bindingResult,
			Model model) {

		if (bindingResult.hasErrors()) {
			model.addAttribute("supplierpage", true);
			model.addAttribute("mysupplier", supplier);
			model.addAttribute("Error1", true);
			model.addAttribute("Success", false);
			model.addAttribute("Error2", false);
			model.addAttribute("supplier_list", supplierDao.selectAllSupplier());
			model.addAttribute("Error3", false);
			model.addAttribute("edit", false);

		}

		else {
			try {
				if (supplierDao.updateSupplier(supplier)) {
					model.addAttribute("supplierpage", true);
					model.addAttribute("mysupplier", new Supplier());
					model.addAttribute("Error1", false);
					model.addAttribute("Success", true);
					model.addAttribute("Error2", false);
					model.addAttribute("supplier_list", supplierDao.selectAllSupplier());
					model.addAttribute("Error3", false);
					model.addAttribute("edit", false);
				}
				else
				{
					model.addAttribute("supplierpage", true);
					model.addAttribute("mysupplier", new Supplier());
					model.addAttribute("Error1", false);
					model.addAttribute("Success", false);
					model.addAttribute("Error2", false);
					model.addAttribute("supplier_list", supplierDao.selectAllSupplier());
					model.addAttribute("Error3", true);
					model.addAttribute("edit", false);
				}
			} catch (Exception e) {
				model.addAttribute("supplierpage", true);
				model.addAttribute("mysupplier", supplier);
				model.addAttribute("Error1", false);
				model.addAttribute("Success", false);
				model.addAttribute("Error2", true);
				model.addAttribute("supplier_list", supplierDao.selectAllSupplier());
				model.addAttribute("Error3", false);
				model.addAttribute("edit", false);
			}

		}
		return "index";
	}

}
