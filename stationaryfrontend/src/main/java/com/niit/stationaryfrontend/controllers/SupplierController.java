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

	@RequestMapping("/rsupplier")
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

		} else {
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
				} else {
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
