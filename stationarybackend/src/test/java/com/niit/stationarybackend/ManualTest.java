package com.niit.stationarybackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.stationarybackend.dao.CategoryDao;
import com.niit.stationarybackend.model.Category;

public class ManualTest {
	public static void main(String args[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		
		CategoryDao categoryDao=(CategoryDao)context.getBean("categoryDao");
		
		Category category=new Category();
		category.setCat_Name("NoteBook");
		category.setCat_Description("180 pages and unruled" );
		
		categoryDao.createCategory(category);
	}

}
