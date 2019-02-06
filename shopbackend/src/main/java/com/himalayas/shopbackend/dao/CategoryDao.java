package com.himalayas.shopbackend.dao;

import java.util.List;

import com.himalayas.shopbackend.model.Category;

public interface CategoryDao {
	boolean createCategory(Category category);
	boolean updateCategory(Category category);
	boolean deleteCategory(Category category);
	List<Category> selectAllCategory();
	Category selectOneCategory(int category_id);
}
