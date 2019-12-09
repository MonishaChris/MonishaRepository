package com.asminds.nw.adminlogin.controller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerDetails {
	
	@Id
	int custid;
	String custname;
	String custpackage;
	String custaddress;
	int custcontact;
	String offer;
	int planyear;
	int amount;
	public CustomerDetails(int custid, String custname, String custpackage, String custaddress, int custcontact,
			String offer, int planyear, int amount) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.custpackage = custpackage;
		this.custaddress = custaddress;
		this.custcontact = custcontact;
		this.offer = offer;
		this.planyear = planyear;
		this.amount = amount;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCustpackage() {
		return custpackage;
	}
	public void setCustpackage(String custpackage) {
		this.custpackage = custpackage;
	}
	public String getCustaddress() {
		return custaddress;
	}
	public void setCustaddress(String custaddress) {
		this.custaddress = custaddress;
	}
	public int getCustcontact() {
		return custcontact;
	}
	public void setCustcontact(int custcontact) {
		this.custcontact = custcontact;
	}
	public String getOffer() {
		return offer;
	}
	public void setOffer(String offer) {
		this.offer = offer;
	}
	public int getPlanyear() {
		return planyear;
	}
	public void setPlanyear(int planyear) {
		this.planyear = planyear;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public CustomerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
