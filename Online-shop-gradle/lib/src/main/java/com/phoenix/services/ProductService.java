package com.phoenix.services;
/*
 * @author  vikas.prajapati@stltech.in
 * Date - 8-jul-2021
 * Version : 1.0
 * @CopyRight : Sterlite Technologies Ltd.
 */
import java.util.List;

import com.phoenix.data.Product;
import com.phoenix.data.User;
import com.phoenix.web.exceptions.ServiceException;
import com.phoenix.web.exceptions.ProductNotFoundException;

public interface ProductService {

	List<Product> findAll() throws ServiceException;

	Product findProductById(int id) throws ProductNotFoundException, ServiceException;
    void add(Product product) throws ServiceException;
    void edit(Product product) throws ServiceException;
    void remove(Product product) throws ServiceException;

	List<Product> findByName(String name) throws ServiceException;
    List<Product> findByBrand(String brand) throws ServiceException;
    List<Product> findByPrice(float price) throws ServiceException;
    List<Product> findByPriceRange(float minPrice, float maxPrice) throws ServiceException;
    List<Product> findByNameAndBrand(String name, String brand) throws ServiceException;
    List<Product> findByNameAndPrice(String name, float price) throws ServiceException;
    List<Product> findBrandAndPrice(String brand, float price) throws ServiceException;

	List<Product> sortByName() throws ServiceException;
    List<Product> sortByBrand() throws ServiceException;
    List<Product> sortByPrice() throws ServiceException;
    List<Product> sortByPriceDesc() throws ServiceException;
	
}
