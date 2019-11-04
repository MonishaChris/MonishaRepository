package com.asminds.bms.adminlogin.controller;

public class Adminloginbean {
	int id;
	String username;
	String password;
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
	public Adminloginbean(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public Adminloginbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
