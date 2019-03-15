package com.niit.stationarybackend.dao;

import java.util.List;

import com.niit.stationarybackend.model.Cart;

public interface CartDao {

	boolean createCart(Cart cart);
	boolean updateCart(Cart cart);
	boolean deleteCart(Cart cart);
	List<Cart> selectAllCart(int user_id);
	Cart selectOneCart(int item_id);

}
