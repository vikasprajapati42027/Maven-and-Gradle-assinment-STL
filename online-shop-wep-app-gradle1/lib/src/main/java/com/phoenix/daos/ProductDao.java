package com.phoenix.daos;
/*
 * @author  vikas.prajapati@stltech.in
 * Date - 8-jul-2021
 * Version : 1.0
 * @CopyRight : Sterlite Technologies Ltd.
 */
import java.sql.SQLException;
import java.util.List;

import com.phoenix.data.Product;
import com.phoenix.data.User;

public interface ProductDao {
	
	Product getProductById(int id);
	List<Product> getAllProduct();
	void insert(Product product);
	void update(Product product);
	void delete(Product product);
	
	

}
