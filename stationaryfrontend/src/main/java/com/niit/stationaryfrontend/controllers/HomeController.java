package com.niit.stationaryfrontend.controllers;

import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.stationarybackend.dao.CartDao;
import com.niit.stationarybackend.dao.ProductDao;
import com.niit.stationarybackend.dao.SupplierDao;
import com.niit.stationarybackend.dao.UserDao;
import com.niit.stationarybackend.model.Cart;
import com.niit.stationarybackend.model.Product;
import com.niit.stationarybackend.model.Supplier;
import com.niit.stationarybackend.model.User;

@Controller
public class HomeController {

	@Autowired
	UserDao userDao;

	@Autowired
	SupplierDao supplierDao;

	@Autowired
	ProductDao productDao;
	
	@Autowired
	CartDao cartDao;

	@RequestMapping(value = { "/", "/home" })
	String HomePage(Model model) {
		model.addAttribute("carousel", true);
		return "index";
	}

	@RequestMapping("/login")
	String SignInPage(Model model) {
		model.addAttribute("signin", true);
		model.addAttribute("error", false);
		return "index";
	}

	@RequestMapping("/flogin")
	String fSignInPage(Model model) {
		model.addAttribute("signin", true);
		model.addAttribute("error", true);
		return "index";
	}

	@RequestMapping("/loginsuccess")
	public String isLoggedin(HttpSession session) {
		String email = SecurityContextHolder.getContext().getAuthentication().getName();
		Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) SecurityContextHolder.getContext()
				.getAuthentication().getAuthorities();
		for (GrantedAuthority authority : authorities) {
			System.out.println(authority.getAuthority().toString());
			if (authority.getAuthority().equals("ROLE_USER")) {
				User user = userDao.selectOneUser(email);
				List<Cart> cartitems=cartDao.selectAllCart(user.getU_Id());
				session.setAttribute("cartitems", cartitems);
				session.setAttribute("itemcount", cartitems.size());
				session.setAttribute("useremail", user.getU_Emailid());
				session.setAttribute("userid", user.getU_Id());
				session.setAttribute("loginName", user.getU_Name());
				session.setAttribute("UserloggedIn", true);
		
			} else if (authority.getAuthority().equals("ROLE_ADMIN")) {

				Supplier supplier = supplierDao.selectOneSupplier(email);
				session.setAttribute("SupplierLoggedIn", true);
				session.setAttribute("supplierId", supplier.getSupplier_Id());
				session.setAttribute("loginName", supplier.getSupplier_Name());
			
			} else {
				session.setAttribute("AdminLoggedIn", true);
				session.setAttribute("loginName", "Administrator");
			}
		}
		return "redirect:/";

	}

	// @RequestMapping("/signup")
	// String SignUpPage(Model model)
	// {
	// model.addAttribute("signup",true);
	// return "index";
	// }

	@RequestMapping("/contactus")
	String ContactUsPage(Model model) {
		model.addAttribute("contactus", true);
		return "index";

	}

	@RequestMapping("/aboutus")
	String AboutUsPage(Model model) {
		model.addAttribute("aboutus", true);
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
		// model.addAttribute("title", "GiftGalore-Products");
		model.addAttribute("myproduct", productDao.selectOneProduct(pid));
		return "index";

	}

}
