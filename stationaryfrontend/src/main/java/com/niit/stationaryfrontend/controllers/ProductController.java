package com.niit.stationaryfrontend.controllers;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.niit.stationarybackend.dao.CategoryDao;
import com.niit.stationarybackend.dao.ProductDao;
import com.niit.stationarybackend.model.Product;

@Controller
public class ProductController {
	@Autowired
	ProductDao productDao;

	@Autowired
	CategoryDao categoryDao;

	void addimage(MultipartFile f, int id) {
		try {
			String path = "C:\\Users\\Admin\\workspace\\stationaryfrontend\\src\\main\\webapp\\resources\\pimage\\";
			path = path + String.valueOf(id) + ".jpg";
			if (!f.isEmpty()) {
				byte[] imagebytes = f.getBytes();
				File x = new File(path);
				if (x.exists()) {
					x.delete();
					BufferedOutputStream bs = new BufferedOutputStream(new FileOutputStream(x));
					bs.write(imagebytes);
					bs.close();
				} else {
					BufferedOutputStream bs = new BufferedOutputStream(new FileOutputStream(x));
					bs.write(imagebytes);
					bs.close();
				}
			}
			Thread.sleep(5000);
		} catch (Exception e) {

		}
	}

	@RequestMapping("/product")
	String productPage(Model model) {
		model.addAttribute("prodpage", true);
		model.addAttribute("myproduct", new Product());
		model.addAttribute("Error1", false);
		model.addAttribute("Success", false);
		model.addAttribute("Error2", false);
		model.addAttribute("product_list", productDao.selectAllProduct());
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

	@RequestMapping("/addProduct")
	String insertProductPage(@Valid @ModelAttribute("myproduct") Product product, BindingResult bindingResult,
			Model model) {

		if (bindingResult.hasErrors()) {
			model.addAttribute("prodpage", true);
			model.addAttribute("myproduct", product);
			model.addAttribute("Error1", true);
			model.addAttribute("Success", false);
			model.addAttribute("Error2", false);
			model.addAttribute("product_list", productDao.selectAllProduct());
			model.addAttribute("category_list", categoryDao.selectAllCategory());
			model.addAttribute("Error3", false);
			model.addAttribute("edit", false);

		}

		else {
			try {

				if (productDao.createProduct(product)) {

					addimage(product.getPimage(), product.getProd_id());
					model.addAttribute("prodpage", true);
					model.addAttribute("myproduct", new Product());
					model.addAttribute("Error1", false);
					model.addAttribute("Success", true);
					model.addAttribute("Error2", false);
					model.addAttribute("product_list", productDao.selectAllProduct());
					model.addAttribute("category_list", categoryDao.selectAllCategory());
					model.addAttribute("Error3", false);
					model.addAttribute("edit", false);
				} else {
					model.addAttribute("prodpage", true);
					model.addAttribute("myproduct", product);
					model.addAttribute("Error1", false);
					model.addAttribute("Success", false);
					model.addAttribute("Error2", false);
					model.addAttribute("product_list", productDao.selectAllProduct());
					model.addAttribute("category_list", categoryDao.selectAllCategory());
					model.addAttribute("Error3", true);
					model.addAttribute("edit", false);

				}

			} catch (Exception e) {
				model.addAttribute("prodpage", true);
				model.addAttribute("myproduct", product);
				model.addAttribute("Error1", false);
				model.addAttribute("Success", false);
				model.addAttribute("Error2", true);
				model.addAttribute("product_list", productDao.selectAllProduct());
				model.addAttribute("category_list", categoryDao.selectAllCategory());
				model.addAttribute("Error3", false);
				model.addAttribute("edit", false);
			}

		}
		return "index";
	}

	@RequestMapping("/deleteProduct")
	String deleteProductPage(@RequestParam("prodid") int prod_Id, Model model) {
		try {
			if (productDao.deleteProduct(productDao.selectOneProduct(prod_Id)))
				return "redirect:/product";
			else {
				model.addAttribute("prodpage", true);
				model.addAttribute("myproduct", new Product());
				model.addAttribute("Error1", false);
				model.addAttribute("Success", false);
				model.addAttribute("Error2", false);
				model.addAttribute("product_list", productDao.selectAllProduct());
				model.addAttribute("category_list", categoryDao.selectAllCategory());
				model.addAttribute("Error3", true);
				model.addAttribute("edit", false);
				return "index";
			}

		} catch (Exception e) {
			model.addAttribute("prodpage", true);
			model.addAttribute("myproduct", new Product());
			model.addAttribute("Error1", false);
			model.addAttribute("Success", false);
			model.addAttribute("Error2", false);
			model.addAttribute("product_list", productDao.selectAllProduct());
			model.addAttribute("category_list", categoryDao.selectAllCategory());
			model.addAttribute("Error3", true);
			model.addAttribute("edit", false);
			return "index";

		}

	}

	@RequestMapping("/editProduct")
	String productPage(@RequestParam("prodid") int prod_Id, Model model) {
		model.addAttribute("prodpage", true);
		model.addAttribute("myproduct", productDao.selectOneProduct(prod_Id));
		model.addAttribute("Error1", false);
		model.addAttribute("Success", false);
		model.addAttribute("Error2", false);
		model.addAttribute("product_list", productDao.selectAllProduct());
		model.addAttribute("category_list", categoryDao.selectAllCategory());
		model.addAttribute("Error3", false);
		model.addAttribute("edit", true);
		return "index";
	}

	@RequestMapping("/updateProduct")
	String updateProductPage(@Valid @ModelAttribute("myproduct") Product product, BindingResult bindingResult,
			Model model) {

		if (bindingResult.hasErrors()) {
			model.addAttribute("prodpage", true);
			model.addAttribute("myproduct", product);
			model.addAttribute("Error1", true);
			model.addAttribute("Success", false);
			model.addAttribute("Error2", false);
			model.addAttribute("product_list", productDao.selectAllProduct());
			model.addAttribute("category_list", categoryDao.selectAllCategory());
			model.addAttribute("Error3", false);
			model.addAttribute("edit", true);

		}

		else {
			try {

				if (productDao.updateProduct(product)) {
					addimage(product.getPimage(), product.getProd_id());
					model.addAttribute("prodpage", true);
					model.addAttribute("myproduct", new Product());
					model.addAttribute("Error1", false);
					model.addAttribute("Success", true);
					model.addAttribute("Error2", false);
					model.addAttribute("product_list", productDao.selectAllProduct());
					model.addAttribute("category_list", categoryDao.selectAllCategory());
					model.addAttribute("Error3", false);
					model.addAttribute("edit", false);
				} else {
					model.addAttribute("prodpage", true);
					model.addAttribute("myproduct", product);
					model.addAttribute("Error1", false);
					model.addAttribute("Success", false);
					model.addAttribute("Error2", false);
					model.addAttribute("product_list", productDao.selectAllProduct());
					model.addAttribute("category_list", categoryDao.selectAllCategory());
					model.addAttribute("Error3", true);
					model.addAttribute("edit", true);

				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
				model.addAttribute("prodpage", true);
				model.addAttribute("myproduct", product);
				model.addAttribute("Error1", false);
				model.addAttribute("Success", false);
				model.addAttribute("Error2", true);
				model.addAttribute("product_list", productDao.selectAllProduct());
				model.addAttribute("category_list", categoryDao.selectAllCategory());
				model.addAttribute("Error3", false);
				model.addAttribute("edit", true);
			}

		}
		return "index";
	}

	@RequestMapping("/viewallproduct")
	public String viewAllProducts(Model model) {
		model.addAttribute("allproductpage", true);
		model.addAttribute("myproduct", new Product());
		model.addAttribute("product_list", productDao.selectAllProduct());
		return "index";
	}

	@RequestMapping("/viewoneproduct")
	public String oneproductpage(Model model, @RequestParam("pid") int pid) {
		model.addAttribute("oneproductpage", true);
		//model.addAttribute("title", "GiftGalore-Products");
		model.addAttribute("myproduct", productDao.selectOneProduct(pid));
		return "index";

	}

}
