package com.siri.hsi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FB_user")
public class FBUser implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column(name="user_id" , nullable=false)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userID;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="user_password")
	private String password;
	
	@Column(name="email_addr")
	private String emailAddr;

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
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

	public String getEmailAddr() {
		return emailAddr;
	}

	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}

	@Override
	public String toString() {
		return "FBUser [userID=" + userID + ", userName=" + userName + ", password=" + password + ", emailAddr="
				+ emailAddr + "]";
	}
	
	
}
