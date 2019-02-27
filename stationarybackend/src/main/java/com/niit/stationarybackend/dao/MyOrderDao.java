package com.niit.stationarybackend.dao;

import java.util.List;

import com.niit.stationarybackend.model.MyOrder;

public interface MyOrderDao {
	boolean createOrder(MyOrder myorder);

	boolean updateOrder(MyOrder myorder);

	boolean deleteOrder(MyOrder myorder);

	List<MyOrder> selectAllOrder(int user_Id);

	MyOrder selectOneOrder(String myorder_Id);

}
