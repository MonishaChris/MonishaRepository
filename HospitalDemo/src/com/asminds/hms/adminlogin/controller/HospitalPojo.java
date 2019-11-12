package com.asminds.hms.adminlogin.controller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HospitalPojo {
	@Id
	int patientid;
	String patientname;
	String address;
	int contact;
	String disease;
	int doctorid;
	String doctorname;
	public HospitalPojo(int patientid, String patientname, String address, int contact, String disease, int doctorid,
			String doctorname) {
		super();
		this.patientid = patientid;
		this.patientname = patientname;
		this.address = address;
		this.contact = contact;
		this.disease = disease;
		this.doctorid = doctorid;
		this.doctorname = doctorname;
	}
	public int getPatientid() {
		return patientid;
	}
	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public int getDoctorid() {
		return doctorid;
	}
	public void setDoctorid(int doctorid) {
		this.doctorid = doctorid;
	}
	public String getDoctorname() {
		return doctorname;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	public HospitalPojo() {
		super();
	}
	

}
