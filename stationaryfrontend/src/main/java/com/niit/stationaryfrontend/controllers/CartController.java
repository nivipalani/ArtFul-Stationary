package com.niit.stationaryfrontend.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.stationarybackend.dao.CartDao;

@Controller
@RequestMapping("/user")
public class CartController {
	@Autowired
	CartDao cartdao;

	@RequestMapping("/viewcart")
	String viewCart(Model model, HttpSession session) {
		model.addAttribute("cartpage", true);
		model.addAttribute("cartitems",
				cartdao.selectAllCart(Integer.parseInt(session.getAttribute("userid").toString())));
		return "index";
	}
}
