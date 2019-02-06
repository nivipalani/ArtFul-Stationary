package com.himalayas.shopbackend.dao;

import java.util.List;

import com.himalayas.shopbackend.model.UserCred;

public interface UserCredDao {
	boolean createUserCred(UserCred userCred);
	boolean updateUserCred(UserCred userCred);
	boolean deleteUserCred(UserCred userCred);
	List<UserCred> selectAllUserCred();
	UserCred selectOneCategory(int user_Emailid);

}
