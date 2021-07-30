package com.phoenix.web.models;

import java.sql.SQLException;

import com.phoenix.daos.LoginDao;
import com.phoenix.daos.LoginDaoImpl;
import com.phoenix.data.User;
import com.phoenix.web.exceptions.ServiceException;
import com.phoenix.services.LoginService;
import com.phoenix.services.LoginServiceImpl;
import com.phoenix.web.exceptions.UserNotFoundException;

/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 26-jun-2021
 * version : 1.0
 * Copyright : Sterlite technologies Ltd.
 */
public class LoginBean {

	private String username;
	private String password;

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

	public boolean isValid() throws UserNotFoundException, ServiceException, SQLException {

		LoginService loginService = new LoginServiceImpl();
		// LoginDao loginDao = new LoginDaoImpl();
		User dbUser = null;

		dbUser = loginService.findByUserId(username);

		if (username != null && password != null && username.equals(dbUser.getUsername())
				&& password.equals(dbUser.getPassword())) {
			return true;
		} else {
			return false;
		}
	}
}
