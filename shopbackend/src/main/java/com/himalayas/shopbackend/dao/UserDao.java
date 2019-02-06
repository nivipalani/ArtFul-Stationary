package com.himalayas.shopbackend.dao;

import java.util.List;

import com.himalayas.shopbackend.model.User;

public interface UserDao {
	boolean createUser(User user);
	boolean updateUser(User user);
	boolean deleteUser(User user);
	List<User> selectAllUser();
	User selectOneUser(int user_Id);

}
