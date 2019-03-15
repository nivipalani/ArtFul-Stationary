package com.niit.stationarybackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Supplier {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int supplier_Id;

	@NotEmpty(message = "Supplier Name is mandatory")
	@Column(nullable = false)
	String supplier_Name;

	@NotEmpty(message = "Supplier Location is mandatory")
	@Column(nullable = false)
	String location;

	@NotEmpty(message = "Supplier Phone Number is mandatory")
	@Column(nullable = false, unique = true)
	String supplier_phonenumber;

	@NotEmpty(message = "Supplier EmailId is mandatory")
	@Column(nullable = false, unique = true)
	String supplier_emailid;

	@Transient
	@NotEmpty(message="password is mandatory")
	@Column(nullable=false)
	String supplier_password;
	
	public int getSupplier_Id() {
		return supplier_Id;
	}

	public void setSupplier_Id(int supplier_Id) {
		this.supplier_Id = supplier_Id;
	}

	public String getSupplier_Name() {
		return supplier_Name;
	}

	public void setSupplier_Name(String supplier_Name) {
		this.supplier_Name = supplier_Name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSupplier_emailid() {
		return supplier_emailid;
	}

	public void setSupplier_emailid(String supplier_emailid) {
		this.supplier_emailid = supplier_emailid;
	}

	public String getSupplier_phonenumber() {
		return supplier_phonenumber;
	}

	public void setSupplier_phonenumber(String supplier_phonenumber) {
		this.supplier_phonenumber = supplier_phonenumber;
	}

	public String getSupplier_password() {
		return supplier_password;
	}

	public void setSupplier_password(String supplier_password) {
		this.supplier_password = supplier_password;
	}
	

}
