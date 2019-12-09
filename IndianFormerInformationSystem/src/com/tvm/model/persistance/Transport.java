package com.tvm.model.persistance;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Transport {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@NotEmpty(message="Id cannot be empty")
	private int id;
	@NotEmpty(message="Name cannot be empty")
	private String drivername;
	@NotEmpty(message="VehicleName cannot be empty")
	private String vehicletype;
	@Min(value=10,message="MobileNumber minimum 10")
	@Max(value=12,message="MobileNumber maximum 12")
	@NotNull(message="MobileNumber can't be empty")
	private Long mobile;
	@NotEmpty(message="LocationName cannot be empty")
	private String location;
	@NotEmpty(message="StreetName cannot be empty")
	private String street;
	@NotEmpty(message="CityName cannot be empty")
	private String city;
	@NotEmpty(message="StateName cannot be empty")
	private String state;
	@Max(value=5,message="Pincode maximum 12")
	@NotEmpty(message="Pincode cannot be empty")
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