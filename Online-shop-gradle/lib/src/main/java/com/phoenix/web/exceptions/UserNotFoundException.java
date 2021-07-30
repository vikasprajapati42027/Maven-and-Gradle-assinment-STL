package com.phoenix.web.exceptions;

/*
 * @author  vikas.prajapati@stltech.in
 * Date - 8-jul-2021
 * Version : 1.0
 * @CopyRight : Sterlite Technologies Ltd.
 */
//application specific Exception
public class UserNotFoundException extends Exception {

	private String errorMessage;

	public UserNotFoundException(String errorMessage) {
		super(errorMessage);
		
	}

	
}
