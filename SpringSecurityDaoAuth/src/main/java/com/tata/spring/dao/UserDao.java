package com.tata.spring.dao;

/**
*
* @author Tatarao voleti
* @date   May 22, 2015
*/
import java.util.List;

import com.tata.spring.beans.UserBean;

public interface UserDao {
	
	public void addUser(UserBean user);
	public void updateUser(UserBean user);
	public void deleteUser(UserBean user);
	public UserBean findUser(String username);
	public List<UserBean> listUsers();

}
