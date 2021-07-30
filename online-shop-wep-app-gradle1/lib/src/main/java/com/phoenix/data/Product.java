package com.phoenix.data;

import javax.persistence.Entity;
import javax.persistence.Id;


/*
 * @author  vikas.prajapati@stltech.in
 * Date - 8-jul-2021
 * Version : 2.0
 * @CopyRight : Sterlite Technologies Ltd.
 */
//Value Object class - Java Bean Class - POJO -persistent class or entity class
@Entity
public class Product {
    //Data members
	
	@Id
	private int id;
	private String name;
	private String brand;
	private float price;
	
	//Default Consructor
	public Product() {
		id = 1021;
		name = "laptop";
		brand = "Dell";
		price = 49000.00f;
	}
	//Parameter Constructor
	public Product(int id, String name, String brand, float price) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	 //Getter and setter Method
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
   
	
	
	
}
