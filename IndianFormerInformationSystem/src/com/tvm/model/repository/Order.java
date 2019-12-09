package com.tvm.model.repository;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="`Order`")
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int orderid;
	private String ordername;
	private String orderdate;
	private String deliverydate;
	private String productname;
	@Column(name = "`quantity`")
	private String quantity;
	private float rate;
	private float total;
	private int farmerid;
	private String location;
	
	
	public Order(int orderid, String ordername, String orderdate, String deliverydate, String productname,
			String quantity, float rate, float total, int farmerid, String location) {
		super();
		this.orderid = orderid;
		this.ordername = ordername;
		this.orderdate = orderdate;
		this.deliverydate = deliverydate;
		this.productname = productname;
		this.quantity = quantity;
		this.rate = rate;
		this.total = total;
		this.farmerid = farmerid;
		this.location = location;
	}


	public int getOrderid() {
		return orderid;
	}


	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}


	public String getOrdername() {
		return ordername;
	}


	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}


	public String getOrderdate() {
		return orderdate;
	}


	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}


	public String getDeliverydate() {
		return deliverydate;
	}


	public void setDeliverydate(String deliverydate) {
		this.deliverydate = deliverydate;
	}


	public String getProductname() {
		return productname;
	}


	public void setProductname(String productname) {
		this.productname = productname;
	}


	public String getQuantity() {
		return quantity;
	}


	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}


	public float getRate() {
		return rate;
	}


	public void setRate(float rate) {
		this.rate = rate;
	}


	public float getTotal() {
		return total;
	}


	public void setTotal(float total) {
		this.total = total;
	}


	public int getFarmerid() {
		return farmerid;
	}


	public void setFarmerid(int farmerid) {
		this.farmerid = farmerid;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
