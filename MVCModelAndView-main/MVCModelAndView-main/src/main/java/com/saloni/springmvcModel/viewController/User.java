package com.saloni.springmvcModel.viewController;

public class User {
	private String userEmail;
	private String userName;
	private String userPassword;
	
	public String getEmail() {
		return userEmail;
	}
	public void setEmail(String email) {
		this.userEmail = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return userPassword;
	}
	public void setPassword(String password) {
		this.userPassword = password;
	}
	@Override
	public String toString() {
		return "User [userEmail=" + userEmail + ", userName=" + userName + ", userPassword=" + userPassword + "]";
	}
	
	
	
}
