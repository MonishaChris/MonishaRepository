package com.asminds.ems.adminlogin.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CrudPojo {	
	@Id
	private int stuid;
	private String stuname;
	private String stuaddress;
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public String getStuaddress() {
		return stuaddress;
	}
	public void setStuaddress(String stuaddress) {
		this.stuaddress = stuaddress;
	}
	public CrudPojo(int stuid, String stuname, String stuaddress) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
		this.stuaddress = stuaddress;
	}
	public CrudPojo() {
		super();
	}
	

}
