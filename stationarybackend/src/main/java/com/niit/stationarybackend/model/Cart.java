package com.niit.stationarybackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int item_Id;
	
	@ManyToOne
	User user;
	
	@ManyToOne
	Product product;
	
	@Column(nullable=false,columnDefinition="number")
	int quantity;
	
	@Column(nullable=false)
	float subTotal;

	public int getItem_Id() {
		return item_Id;
	}

	public void setItem_Id(int item_Id) {
		this.item_Id = item_Id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(float subTotal) {
		this.subTotal = subTotal;
	}
			
	
}
