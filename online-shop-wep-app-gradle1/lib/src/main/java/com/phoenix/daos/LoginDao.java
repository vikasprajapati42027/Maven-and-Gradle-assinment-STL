package com.phoenix.daos;

import java.util.List;

import com.phoenix.data.User;
/*
 * @author  vikas.prajapati@stltech.in
 * Date - 9-jul-2021
 * Version : 2.0
 * @CopyRight : Sterlite Technologies Ltd.
 */
public interface LoginDao {
	
	List<User> getAll();
	User getUserbyId(String username);
	void insert(User user);
	void update(User user);
	void delete(User user);
	
}
