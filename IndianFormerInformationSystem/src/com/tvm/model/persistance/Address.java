package com.tvm.model.persistance;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Embeddable

public class Address {
	

	private String street;
	private String city;
	private String state;
	

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	

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

	



	public Address(String street, String city, String state) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		
	}

	

}
