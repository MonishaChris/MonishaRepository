package com.asminds.vms.adminlogin.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class VehiclePojo {
	@Id
	int vehicleid;
	String vehiclename;
	String model;
	int manufacturedyear;
	String color;
	int cost;
	public VehiclePojo(int vehicleid, String vehiclename, String model, int manufacturedyear, String color, int cost) {
		super();
		this.vehicleid = vehicleid;
		this.vehiclename = vehiclename;
		this.model = model;
		this.manufacturedyear = manufacturedyear;
		this.color = color;
		this.cost = cost;
	}
	public int getVehicleid() {
		return vehicleid;
	}
	public void setVehicleid(int vehicleid) {
		this.vehicleid = vehicleid;
	}
	public String getVehiclename() {
		return vehiclename;
	}
	public void setVehiclename(String vehiclename) {
		this.vehiclename = vehiclename;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getManufacturedyear() {
		return manufacturedyear;
	}
	public void setManufacturedyear(int manufacturedyear) {
		this.manufacturedyear = manufacturedyear;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public VehiclePojo() {
		super();
	}
	
	

}
