package com.niit.stationaryfrontend.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.stationarybackend.dao.AddressDao;
import com.niit.stationarybackend.dao.CartDao;
import com.niit.stationarybackend.dao.MyOrderDao;
import com.niit.stationarybackend.dao.ProductDao;
import com.niit.stationarybackend.dao.UserDao;
import com.niit.stationarybackend.model.Cart;
import com.niit.stationarybackend.model.MyOrder;
import com.niit.stationarybackend.model.Product;

@Controller
@RequestMapping("/user")
public class OrderController {
	

		@Autowired
		CartDao cartdao;

		@Autowired
		AddressDao adddao;

		@Autowired
		UserDao userdao;

		@Autowired
		ProductDao prodao;

		@Autowired
		MyOrderDao myordedao;

		@RequestMapping("/placeorder")
		String placeOrder(@RequestParam("addressid") int addid, Model model, HttpSession httpSession) {
			MyOrder oMyorder = new MyOrder();
			ArrayList<Cart> carts = (ArrayList<Cart>) cartdao
					.selectAllCart(Integer.parseInt(httpSession.getAttribute("userid").toString()));
			Iterator<Cart> iterator = carts.iterator();
			while (iterator.hasNext()) {
				Date d = new Date();
				long id = UUID.randomUUID().getMostSignificantBits();
				String oid = "OD-".concat(String.valueOf(id).replace("-", "5"));
				Cart cart = (Cart) iterator.next();
				Product p=prodao.selectOneProduct(cart.getProduct().getProd_id());
				if (p.getProd_quantity() >= cart.getQuantity()) 
				{
					oMyorder.setAddress(adddao.selectOneAddress(addid));
					oMyorder.setOrder_Id(oid);
					oMyorder.setOrderDate(d);
					oMyorder.setQuantity(cart.getQuantity());
					oMyorder.setProduct(cart.getProduct());
					oMyorder.setGrandTotal(cart.getSubTotal());
					oMyorder.setUser(userdao.selectOneUser(httpSession.getAttribute("useremail").toString()));
					int qty=p.getProd_quantity() - cart.getQuantity();
					p.setProd_quantity(qty);
					if(myordedao.createOrder(oMyorder))
					{
						prodao.updateProduct(p);
						cartdao.deleteCart(cart);
					}
				}
			}
			ArrayList<Cart> cartitems = (ArrayList<Cart>) cartdao.selectAllCart(Integer.parseInt(httpSession.getAttribute("userid").toString()));
			httpSession.setAttribute("itemcount", cartitems.size());
			model.addAttribute("orderlist", myordedao.selectAllOrder(Integer.parseInt(httpSession.getAttribute("userid").toString())));
			model.addAttribute("orderpage", true);
			return "index";
		}
		
		@RequestMapping("/vieworders")
		String viewallorders(Model model,HttpSession httpSession)
		{
			model.addAttribute("orderlist", myordedao.selectAllOrder(Integer.parseInt(httpSession.getAttribute("userid").toString())));
			model.addAttribute("orderpage", true);
			return "index";
		}
		

		@RequestMapping("/receipt")
		String receipt(@RequestParam("rid")String oid,Model model,HttpSession httpSession)
		
		{
			model.addAttribute("order", myordedao.selectOneOrder(oid));
			model.addAttribute("receiptpage", true);
			return "index";
			
		}

	}


