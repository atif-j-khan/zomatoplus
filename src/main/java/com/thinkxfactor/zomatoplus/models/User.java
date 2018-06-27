package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tbl_user")
public class User implements Serializable{
	@Id
	@GeneratedValue
	@Column(name="user_id")
	private long user_id;
	@Column(name="username",unique=true)
	private String username;
	@Column(name="password")
	private String password;
	@Column(name="mobile")
	private String mobile;
	@Column(name="address")
	private String address;
	@Column(name="landmark")
	private String landmark;
	@Column(name="pincode")
	private String pincode;
	 public User(long id, String username, String password, String mobile, String address, String landmark,
			String pincode) {
		super();
		this.user_id = id;
		this.username = username;
		this.password = password;
		this.mobile = mobile;
		this.address = address;
		this.landmark = landmark;
		this.pincode = pincode;
	}
	public User()
	 {
		 super();
	 }
	 
	 public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public long getId() {
		return user_id;
	}
	public void setId(long id) {
		this.user_id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
