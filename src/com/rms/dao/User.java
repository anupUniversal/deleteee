package com.rms.dao;

public class User {
	private String user;
	public String getUser() {
		return user;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String userName;
	private String password;
	
	
}
