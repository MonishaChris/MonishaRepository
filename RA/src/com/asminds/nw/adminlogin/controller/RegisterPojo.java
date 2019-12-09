package com.asminds.nw.adminlogin.controller;

public class RegisterPojo {
	
	int id;
	String custfirstname;
	String custlastname;
	String custusername;
	String custpassword;
	public RegisterPojo(int id, String custfirstname, String custlastname, String custusername, String custpassword) {
		super();
		this.id = id;
		this.custfirstname = custfirstname;
		this.custlastname = custlastname;
		this.custusername = custusername;
		this.custpassword = custpassword;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustfirstname() {
		return custfirstname;
	}
	public void setCustfirstname(String custfirstname) {
		this.custfirstname = custfirstname;
	}
	public String getCustlastname() {
		return custlastname;
	}
	public void setCustlastname(String custlastname) {
		this.custlastname = custlastname;
	}
	public String getCustusername() {
		return custusername;
	}
	public void setCustusername(String custusername) {
		this.custusername = custusername;
	}
	public String getCustpassword() {
		return custpassword;
	}
	public void setCustpassword(String custpassword) {
		this.custpassword = custpassword;
	}
	public RegisterPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
