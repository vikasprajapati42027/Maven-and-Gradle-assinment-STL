package com.phoenix.web.exceptions;
/*
 * @author  vikas.prajapati@stltech.in
 * Date - 8-jul-2021
 * Version : 1.0
 * @CopyRight : Sterlite Technologies Ltd.
 */
public class ProductNotFoundException extends Exception {

	private String message;

	/**
	 * 
	 */
	public ProductNotFoundException(String message) {
		super();
	 this.message=message;
	}

	
	
	
}
