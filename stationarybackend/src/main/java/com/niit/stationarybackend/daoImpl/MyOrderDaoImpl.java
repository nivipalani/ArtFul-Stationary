package com.niit.stationarybackend.daoImpl;

import java.util.List;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.stationarybackend.dao.MyOrderDao;
import com.niit.stationarybackend.model.MyOrder;

@Repository("myorderDAO")
@Transactional
public class MyOrderDaoImpl implements MyOrderDao {
	@Autowired
	SessionFactory sessionFactory;

	public boolean createOrder(MyOrder myorder) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().save(myorder);
			return true;

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean updateOrder(MyOrder myorder) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().update(myorder);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean deleteOrder(MyOrder myorder) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().delete(myorder);
			return true;

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public List<MyOrder> selectAllOrder(int user_Id) {
		// TODO Auto-generated method stub
		try {
			return sessionFactory.getCurrentSession().createQuery("from MyOrder where user_u_Id=" + user_Id).list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	public MyOrder selectOneOrder(String myorder_Id) {
		// TODO Auto-generated method stub
		try {
			return (MyOrder) sessionFactory.getCurrentSession().createQuery("from MyOrder where order_Id='" + myorder_Id+"'")
					.uniqueResult();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}
