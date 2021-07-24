package com.customerservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class Users {
	

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="id")
	private int userId;
	
	@Column(name="name")
	private String userName;
	
	@Column(name="email")
	private String userEmail;
	
	@Column(name="phone")
	private int userPhone;
	
	

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Users(int userId, String userName, String userEmail, int userPhone) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
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



	public String getUserEmail() {
		return userEmail;
	}



	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}



	public int getUserPhone() {
		return userPhone;
	}



	public void setUserPhone(int userPhone) {
		this.userPhone = userPhone;
	}



	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userPhone="
				+ userPhone + "]";
	}
	
	

}
