package com.niit.stationarybackend.dao;

import java.util.List;

import com.niit.stationarybackend.model.UserCred;

public interface UserCredDao {
	boolean createUserCred(UserCred userCred);
	boolean updateUserCred(UserCred userCred);
	boolean deleteUserCred(UserCred userCred);
	List<UserCred> selectAllUserCred();
	UserCred selectOneUserCred(String user_Emailid);

}
