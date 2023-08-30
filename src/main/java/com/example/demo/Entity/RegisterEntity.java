package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class RegisterEntity {

	@Id
	@GeneratedValue
	private int user_id;
	private String name;
	private String address;
	private String mobile_no;
	private String password;
	public RegisterEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RegisterEntity(int user_id, String name, String address, String mobile_no, String password) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.address = address;
		this.mobile_no = mobile_no;
		this.password = password;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
