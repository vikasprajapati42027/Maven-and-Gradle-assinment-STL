package com.phoenix.services;
/*
 * @author  vikas.prajapati@stltech.in
 * Date - 8-jul-2021
 * Version : 1.0
 * @CopyRight : Sterlite Technologies Ltd.
 */
import java.util.List;
/*
 * author vikas.prajapati@stltech.in
 */

//Service INterfacce contains Bsiiness login methods
import com.phoenix.data.User;
import com.phoenix.web.exceptions.ServiceException;
import com.phoenix.web.exceptions.UserNotFoundException;
public interface LoginService {
	
	List<User> findAll()throws ServiceException;
	User findByUserId(String username)throws UserNotFoundException,ServiceException;
	void add(User user)throws ServiceException;
	void edit(User user)throws ServiceException;
	void remove(User user)throws ServiceException;
	
	String changePassword(String newpassword)throws ServiceException;
	
	

}
