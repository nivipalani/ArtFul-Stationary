package com.niit.stationarybackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.stationarybackend.dao.CartDao;
import com.niit.stationarybackend.model.Cart;
import com.niit.stationarybackend.model.Category;

@Repository("cartDao")
@Transactional
public class CartDaoImpl implements CartDao {

	@Autowired
	SessionFactory sessionFactory;

	public boolean createCart(Cart cart) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().save(cart);
			return true;

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}

	}

	public boolean updateCart(Cart cart) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().update(cart);
			return true;

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean deleteCart(Cart cart) {
		// TODO Auto-generated method stub

		try {
			sessionFactory.getCurrentSession().delete(cart);
			return true;

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public List<Cart> selectAllCart(int user_id) {
		// TODO Auto-generated method stub
		List<Cart> cartlist=new ArrayList<Cart>();
		try {
			cartlist=sessionFactory.getCurrentSession().createQuery("from Cart where user_u_Id=" + user_id).list();
			return cartlist;

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return cartlist;
		}
	}

	public Cart selectOneCart(int item_id) {
		// TODO Auto-generated method stub
		try {
			return (Cart) sessionFactory.getCurrentSession().createQuery("from Cart where item_Id=" + item_id)
					.uniqueResult();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}
