package com.tata.spring.entity;

import java.util.List;

import com.tata.spring.enums.UserStatus;

public class User {
	
	private Integer userId;
	private String userName;
	private String password;
	private List<Role> role;
	private UserStatus status;
	
	public User(){
		
	}
	
	public User(Integer userId, String userName, String password,
			List<Role> role, UserStatus status) {
	
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.role = role;
		this.status = status;
	}
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Role> getRole() {
		return role;
	}
	public void setRole(List<Role> role) {
		this.role = role;
	}
	public UserStatus getStatus() {
		return status;
	}
	public void setStatus(UserStatus status) {
		this.status = status;
	}

	
}
