package com.tvm.model.repository;



import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transport {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String drivername;
	private String vehicletype;
	private Long mobile;
	private String location;
	private String street;
	private String city;
	private String state;
	private int pincode;
	
	

	public Transport() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getDrivername() {
		return drivername;
	}



	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}



	public String getVehicletype() {
		return vehicletype;
	}



	public void setVehicletype(String vehicletype) {
		this.vehicletype = vehicletype;
	}



	public Long getMobile() {
		return mobile;
	}



	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
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



	public int getPincode() {
		return pincode;
	}



	public void setPincode(int pincode) {
		this.pincode = pincode;
	}



	public Transport(int id, String drivername, String vehicletype, Long mobile, String location, String street,
			String city, String state, int pincode) {
		super();
		this.id = id;
		this.drivername = drivername;
		this.vehicletype = vehicletype;
		this.mobile = mobile;
		this.location = location;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	
	

	
	
	
}