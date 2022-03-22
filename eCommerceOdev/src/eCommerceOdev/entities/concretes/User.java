package eCommerceOdev.entities.concretes;

import eCommerceOdev.entities.abstracts.Entity;

public class User implements Entity{
	private int userId;
	private String userName;
	private String userLastName;
	private String userMail;
	private String password;
	
	public User() {}
	
	public User(int userId, String userName, String userLastName, String userMail, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userLastName = userLastName;
		this.userMail = userMail;
		this.password = password;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
