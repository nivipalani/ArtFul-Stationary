package com.himalayas.shopbackend.dao;

import java.util.List;

import com.himalayas.shopbackend.model.Product;

public interface ProductDao {
	boolean createProduct(Product product);
	boolean updateProduct(Product product);
	boolean deleteProduct(Product product);
	List<Product> selectAllProduct();
	Product selectOneProduct(int product_id);

}
