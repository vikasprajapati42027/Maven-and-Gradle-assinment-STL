package com.phoenix.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * @author  vikas.prajapati@stltech.in
 * Date - 8-jul-2021
 * Version : 2.0
 * @CopyRight : Sterlite Technologies Ltd.
 */
@Entity
@Table(name="LOGIN")
public class User {

	@Id
	private String username;
	private String password;
	
	/**
	 * 
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Getter and Setter method
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	
	
	
}
