package com.himalayas.shopbackend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.himalayas.shopbackend.dao.UserCredDao;
import com.himalayas.shopbackend.model.UserCred;

public class UserCredDaoImpl implements UserCredDao {
	
	@Autowired
	SessionFactory sessionFactory;

	public boolean createUserCred(UserCred userCred) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().save(userCred);
			return true;
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}

	}

	public boolean updateUserCred(UserCred userCred) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().update(userCred);
			return true;
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean deleteUserCred(UserCred userCred) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().delete(userCred);
			return true;
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
	}

	public List<UserCred> selectAllUserCred() {
		// TODO Auto-generated method stub
		try
		{
			return sessionFactory.getCurrentSession().createQuery("from UserCred").list();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return null;
		}
	}

	public UserCred selectOneCategory(int user_Emailid) {
		try
		{
			return (UserCred)sessionFactory.getCurrentSession().createQuery("from UserCred where u_Emailid="+user_Emailid).uniqueResult();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return null;
		}
	}

}
