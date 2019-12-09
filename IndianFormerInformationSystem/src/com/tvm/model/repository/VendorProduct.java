package com.tvm.model.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

@Entity
public class VendorProduct {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int vendorproductid;
	private int vendorid;
	private String productname;
	private String stock;
	private float price;
	
	public int getVendorid() {
		return vendorid;
	}
	public void setVendorid(int vendorid) {
		this.vendorid = vendorid;
	}
	public int getVendorproductid() {
		return vendorproductid;
	}
	public void setVendorproductid(int vendorproductid) {
		this.vendorproductid = vendorproductid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	public VendorProduct(int vendorproductid, int vendorid, String productname, String stock, float price) {
		super();
		this.vendorproductid = vendorproductid;
		this.vendorid = vendorid;
		this.productname = productname;
		this.stock = stock;
		this.price = price;
	}
	public VendorProduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
