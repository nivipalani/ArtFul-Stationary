package com.niit.stationarybackend.dao;

import java.util.List;

import com.niit.stationarybackend.model.Product;

public interface ProductDao {
	boolean createProduct(Product product);
	boolean updateProduct(Product product);
	boolean deleteProduct(Product product);
	List<Product> selectAllProduct();
	Product selectOneProduct(int product_id);

}
