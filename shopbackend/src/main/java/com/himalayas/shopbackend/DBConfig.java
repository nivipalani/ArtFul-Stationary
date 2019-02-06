package com.himalayas.shopbackend;


import java.util.Properties;

import javax.management.MXBean;
import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@Configuration
@ComponentScan
@EnableTransactionManagement


public class DBConfig {
	
	@Bean
	DataSource myDataSource()
	{
		BasicDataSource basicDataSource=new BasicDataSource();
		basicDataSource.setDriverClassName("org.h2.Driver");
		basicDataSource.setUrl("jdbc:h2:~/Project");
		basicDataSource.setUsername("sa");
		basicDataSource.setPassword("sa");
		
		return basicDataSource;
	}
	
	@Bean
	Properties myProperties()
	{
		Properties properties=new Properties();
		properties.setProperty("hibernate-dialect", "org.hibernate.dialect.H2Dialect");
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		properties.setProperty("hibernate.show_sql", "true");

		return properties;
		
	}
	@Bean("sessionFactory")
	LocalSessionFactoryBean localSessionFactoryBean()
	{
		LocalSessionFactoryBean lSessionFactoryBean=new LocalSessionFactoryBean();
		lSessionFactoryBean.setDataSource(myDataSource());
		lSessionFactoryBean.setHibernateProperties(myProperties());
		lSessionFactoryBean.setPackagesToScan("com.himalayas.shopbackend.model");
		return lSessionFactoryBean;
	}
	@Autowired
	@Bean
	HibernateTransactionManager hibernateTransactionManager(SessionFactory sessionFactory)
	{
		HibernateTransactionManager htManager=new HibernateTransactionManager();
		htManager.setSessionFactory(sessionFactory);
		return htManager;		
	}
	
	
	
	
}
