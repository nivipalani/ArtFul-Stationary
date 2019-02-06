package com.himalayas.shopbackend.model;

import javax.persistence.Column;

public class UserCred {
	
	@Column(nullable=false,unique=true)
	String u_Emailid;
	
	@Column(nullable=false)
	String u_Password;
	
	@Column(nullable=false)
	String u_role;
	
	@Column(nullable=false)
	String u_status;

	public String getU_Emailid() {
		return u_Emailid;
	}

	public void setU_Emailid(String u_Emailid) {
		this.u_Emailid = u_Emailid;
	}

	public String getU_Password() {
		return u_Password;
	}

	public void setU_Password(String u_Password) {
		this.u_Password = u_Password;
	}

	public String getU_role() {
		return u_role;
	}

	public void setU_role(String u_role) {
		this.u_role = u_role;
	}

	public String getU_status() {
		return u_status;
	}

	public void setU_status(String u_status) {
		this.u_status = u_status;
	}
	
	

}
