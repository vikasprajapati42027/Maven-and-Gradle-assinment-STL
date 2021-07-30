package com.phoenix.web.exceptions;
/*
 * @author  vikas.prajapati@stltech.in
 * Date - 8-jul-2021
 * Version : 1.0
 * @CopyRight : Sterlite Technologies Ltd.
 */
public class ServiceException extends Exception {

	private String errorMessage;

	public ServiceException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}
	
}
