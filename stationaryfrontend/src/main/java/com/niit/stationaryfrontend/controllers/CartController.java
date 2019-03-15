package com.niit.stationaryfrontend.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.stationarybackend.dao.CartDao;
import com.niit.stationarybackend.dao.ProductDao;
import com.niit.stationarybackend.dao.UserDao;
import com.niit.stationarybackend.model.Cart;
import com.niit.stationarybackend.model.Product;
import com.niit.stationarybackend.model.User;

@Controller

public class CartController {

	@Autowired
	ProductDao productdao;

	@Autowired
	CartDao cartdao;

	@Autowired
	UserDao userdao;

	@RequestMapping("/user/viewcart")
	String viewCart(Model model, HttpSession session) {

		float tot = 0;

		List<Cart> cartitems = cartdao.selectAllCart(Integer.parseInt(session.getAttribute("userid").toString()));
		Iterator<Cart> iterator = cartitems.listIterator();
		while (iterator.hasNext()) {
			Cart cart = (Cart) iterator.next();
			tot = tot + cart.getSubTotal();
		}
		model.addAttribute("cartpage", true);
		model.addAttribute("cartitems", cartitems);
		session.setAttribute("itemcount", cartitems.size());
		session.setAttribute("shipping", Integer.parseInt(session.getAttribute("itemcount").toString()) * 50);
		session.setAttribute("tot", tot + Integer.parseInt(session.getAttribute("itemcount").toString()) * 50);
		return "index";
	}

	@RequestMapping("/addToCart")
	String addToCart(HttpSession httpSession, @RequestParam("pid") int proid) {
		if (httpSession.getAttribute("userid") == null) {
			httpSession.setAttribute("pid", proid);
			return "redirect:/login";
		} else {
			ArrayList<Cart> cartlist = (ArrayList<Cart>) cartdao
					.selectAllCart(Integer.parseInt(httpSession.getAttribute("userid").toString()));
			if (cartlist.isEmpty()) {
				Cart cart = new Cart();
				Product product = productdao.selectOneProduct(proid);
				cart.setUser(userdao.selectOneUser(httpSession.getAttribute("useremail").toString()));
				cart.setProduct(product);
				cart.setQuantity(1);
				cart.setSubTotal(product.getProd_price());
				cartdao.createCart(cart);
			} else {
				Iterator<Cart> iterator = cartlist.listIterator();
				while (iterator.hasNext()) {
					Cart cart = (Cart) iterator.next();
					Product p = cart.getProduct();
					if (p.getProd_id() == proid) {
						int qty = cart.getQuantity();
						qty = qty + 1;
						cart.setQuantity(qty);
						cart.setSubTotal(qty * p.getProd_price());
						cartdao.updateCart(cart);
						return "redirect:/user/viewcart";
					}
				}
				Cart cart1 = new Cart();
				Product product = productdao.selectOneProduct(proid);
				cart1.setUser(userdao.selectOneUser(httpSession.getAttribute("useremail").toString()));
				cart1.setProduct(product);
				cart1.setQuantity(1);
				cart1.setSubTotal(product.getProd_price());
				cartdao.createCart(cart1);

			}
			return "redirect:/user/viewcart";
		}

	}

	@RequestMapping("/user/deleteCartItem")
	String deletecartitem(@RequestParam("cartId") int cart_Id) {
		cartdao.deleteCart(cartdao.selectOneCart(cart_Id));
		return "redirect:/user/viewcart";
	}

}
