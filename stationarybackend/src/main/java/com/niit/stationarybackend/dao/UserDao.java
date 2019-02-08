package com.niit.stationarybackend.dao;

import java.util.List;

import com.niit.stationarybackend.model.User;

public interface UserDao {
	boolean createUser(User user);
	boolean updateUser(User user);
	boolean deleteUser(User user);
	List<User> selectAllUser();
	User selectOneUser(int user_Id);

}
