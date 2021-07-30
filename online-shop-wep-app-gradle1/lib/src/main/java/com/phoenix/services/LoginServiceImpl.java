package com.phoenix.services;
import java.util.List;

import com.phoenix.daos.LoginDao;
import com.phoenix.daos.LoginDaoImpl;
import com.phoenix.data.User;
import com.phoenix.web.exceptions.ServiceException;
import com.phoenix.web.exceptions.UserNotFoundException;

public class LoginServiceImpl implements LoginService {

	private LoginDao loginDao;
	
	public LoginServiceImpl()
	{
		loginDao = new LoginDaoImpl();
	}
	@Override
	public List<User> findAll()throws ServiceException {
		// TODO Auto-generated method stub
		
		return loginDao.getAll();
		
	}

	@Override
	public User findByUserId(String username) throws UserNotFoundException {
		User user= loginDao.getUserbyId(username);
		if(user!=null)
			return user;
		else
			throw new UserNotFoundException("Sorry! User does not exist");
	}

	public void add(User user) throws ServiceException {
		loginDao.insert(user);
		
	}

	@Override
	public void edit(User user) throws ServiceException {
		loginDao.update(user);
	}

	@Override
	public void remove(User user) throws ServiceException {
		loginDao.delete(user);
	}




	@Override
	public String changePassword(String newpassword) throws ServiceException {
		// TODO Auto-generated method stub
		
		User user=new User();
		user.setPassword(newpassword);
		loginDao.update(user);
		return "Password is updated successfully";
		
	}

}
