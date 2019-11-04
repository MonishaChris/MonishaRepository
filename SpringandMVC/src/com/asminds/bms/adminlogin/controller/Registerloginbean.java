package com.asminds.bms.adminlogin.controller;

public class Registerloginbean {
	String FirstName;
	String LastName;
	String EmailId;
	String Address;
	int PhoneNumber;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public Registerloginbean(String firstName, String lastName, String emailId, String address, int phoneNumber) {
		super();
		FirstName = firstName;
		LastName = lastName;
		EmailId = emailId;
		Address = address;
		PhoneNumber = phoneNumber;
	}
	public Registerloginbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
