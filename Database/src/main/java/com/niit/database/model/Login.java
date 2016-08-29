package com.niit.database.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Login {
	@Id
	private String UserName;
	private String Password;
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	

}
