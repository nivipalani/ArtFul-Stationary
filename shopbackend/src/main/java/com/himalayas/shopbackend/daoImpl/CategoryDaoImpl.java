package com.himalayas.shopbackend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.himalayas.shopbackend.dao.CategoryDao;
import com.himalayas.shopbackend.model.Category;

public class CategoryDaoImpl implements CategoryDao {
	
	@Autowired
	SessionFactory sessionFactory;

	public boolean createCategory(Category category) {
		// TODO Auto-generated method stub
		
		try{
			sessionFactory.getCurrentSession().save(category);
			return true;
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
		
		
	}

	public boolean updateCategory(Category category) {
		// TODO Auto-generated method stub
		try{
			sessionFactory.getCurrentSession().update(category);
			return true;
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
		
	}

	public boolean deleteCategory(Category category) {
		// TODO Auto-generated method stub
		try{
			sessionFactory.getCurrentSession().delete(category);
			return true;
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
		
	}

	public List<Category> selectAllCategory() {
		// TODO Auto-generated method stub
		try{
			return sessionFactory.getCurrentSession().createQuery("from Category").list();
			
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return null;
		}
		
	}

	public Category selectOneCategory(int category_id) {
		try
		{
		return (Category)sessionFactory.getCurrentSession().createQuery("from Category where cat_id="+category_id).uniqueResult();
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return null;
		}
	}

}
