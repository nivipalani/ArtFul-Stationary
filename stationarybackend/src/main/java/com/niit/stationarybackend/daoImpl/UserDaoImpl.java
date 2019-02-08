package com.niit.stationarybackend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.stationarybackend.dao.UserDao;
import com.niit.stationarybackend.model.User;

@Repository("userDao")
@Transactional
public class UserDaoImpl implements UserDao {
	
	@Autowired
	SessionFactory sessionFactory;
	public boolean createUser(User user) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().save(user);
			return true;
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().update(user);
			return true;
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().delete(user);
			return true;
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
	}

	public List<User> selectAllUser() {
		// TODO Auto-generated method stub
		try
		{
			
			return sessionFactory.getCurrentSession().createQuery("from User").list();
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return null;
		}
	}

	public User selectOneUser(int user_id) {
		// TODO Auto-generated method stub
		try
		{
			
			return (User)sessionFactory.getCurrentSession().createQuery("from User where u_Id="+user_id).uniqueResult();
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return null;
		}
	}

}
