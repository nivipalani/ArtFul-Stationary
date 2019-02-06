package com.himalayas.shopbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int u_Id;
	
	@Column(nullable=false,unique=true)
	String u_Name;
	
	@Column(nullable=false,unique=true)
	String u_Emailid;
	
	@Column(nullable=false,unique=true)
	String u_Phonenumber;
	
	public String getU_Phonenumber() {
		return u_Phonenumber;
	}

	public void setU_Phonenumber(String u_Phonenumber) {
		this.u_Phonenumber = u_Phonenumber;
	}

	@Transient
	String u_password;

	public int getU_Id() {
		return u_Id;
	}

	public void setU_Id(int u_Id) {
		this.u_Id = u_Id;
	}

	public String getU_Name() {
		return u_Name;
	}

	public void setU_Name(String u_Name) {
		this.u_Name = u_Name;
	}

	public String getU_Emailid() {
		return u_Emailid;
	}

	public void setU_Emailid(String u_Emailid) {
		this.u_Emailid = u_Emailid;
	}

	

	public String getU_password() {
		return u_password;
	}

	public void setU_password(String u_password) {
		this.u_password = u_password;
	}
	
	
	
	

}
