package com.tvm.model.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

@Entity
public class Customer {

	@Id
	private int customerid;
	private String name;
	private String password;
	private String street;
	private String city;
	private String state;
	private int pincode;
	private String mailId;
	private String contactno;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	
	public Customer(int customerid, String name, String password, String street, String city, String state,
			int pincode, String mailId, String contactno) {
		super();
		this.customerid = customerid;
		this.name = name;
		this.password = password;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.mailId = mailId;
		this.contactno = contactno;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
