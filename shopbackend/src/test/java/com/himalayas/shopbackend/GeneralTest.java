package com.himalayas.shopbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GeneralTest {
	public static void main(String args[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.himalayas");
		context.refresh();
		
		
	}

}
