package com.himalayas.shopbackend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.himalayas.shopbackend.dao.ProductDao;
import com.himalayas.shopbackend.model.Product;

public class ProductDaoImpl implements ProductDao{
	
	@Autowired
	SessionFactory sessionFactory;

	public boolean createProduct(Product product) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().save(product);
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().update(product);
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean deleteProduct(Product product) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().delete(product);
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
	}

	public List<Product> selectAllProduct() {
		// TODO Auto-generated method stub
		try
		{
			return sessionFactory.getCurrentSession().createQuery("from Product").list();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return null;
		}
		
	}

	public Product selectOneProduct(int product_id) {
		// TODO Auto-generated method stub
		try
		{
			return (Product)sessionFactory.getCurrentSession().createQuery("from Product where prod_id="+product_id).uniqueResult();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return null;
		}
		
		}
	}
	
	


