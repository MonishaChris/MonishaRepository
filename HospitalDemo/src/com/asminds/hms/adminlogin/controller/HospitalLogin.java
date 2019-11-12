package com.asminds.hms.adminlogin.controller;

public class HospitalLogin {
	int id;
	String username;
	String password;
	public HospitalLogin(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public HospitalLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
