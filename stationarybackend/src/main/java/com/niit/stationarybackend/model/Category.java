package com.niit.stationarybackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Category 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int cat_Id;
	
	@NotEmpty(message="Category Name is mandatory")
	@Column(nullable=false,unique=true)
	String cat_Name;
	
	@NotEmpty(message="Category Description is mandatory")
	@Column(nullable=false,columnDefinition="text")
	String cat_Description;

	public int getCat_Id() {
		return cat_Id;
	}

	public void setCat_Id(int cat_Id) {
		this.cat_Id = cat_Id;
	}

	public String getCat_Name() {
		return cat_Name;
	}

	public void setCat_Name(String cat_Name) {
		this.cat_Name = cat_Name;
	}

	public String getCat_Description() {
		return cat_Description;
	}

	public void setCat_Description(String cat_Description) {
		this.cat_Description = cat_Description;
	}
	
	
	

}
