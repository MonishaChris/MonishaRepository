package com.asminds.ems.adminlogin.controller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeePojo {
	
	@Id
	int empid;
	String empfirstname;
	String emplastname;
	String empusername;
	String emppassword;
	String empaddress;
	int empcontact;
	public EmployeePojo(int empid, String empfirstname, String emplastname, String empusername, String emppassword,
			String empaddress, int empcontact) {
		super();
		this.empid = empid;
		this.empfirstname = empfirstname;
		this.emplastname = emplastname;
		this.empusername = empusername;
		this.emppassword = emppassword;
		this.empaddress = empaddress;
		this.empcontact = empcontact;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpfirstname() {
		return empfirstname;
	}
	public void setEmpfirstname(String empfirstname) {
		this.empfirstname = empfirstname;
	}
	public String getEmplastname() {
		return emplastname;
	}
	public void setEmplastname(String emplastname) {
		this.emplastname = emplastname;
	}
	public String getEmpusername() {
		return empusername;
	}
	public void setEmpusername(String empusername) {
		this.empusername = empusername;
	}
	public String getEmppassword() {
		return emppassword;
	}
	public void setEmppassword(String emppassword) {
		this.emppassword = emppassword;
	}
	public String getEmpaddress() {
		return empaddress;
	}
	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}
	public int getEmpcontact() {
		return empcontact;
	}
	public void setEmpcontact(int empcontact) {
		this.empcontact = empcontact;
	}
	public EmployeePojo() {
		super();
	}
	

}
