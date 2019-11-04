package com.asminds.crud;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Version;

@Entity

@NamedQueries(
		{
			@NamedQuery(name = "CrudPojobyId", query = "from CrudPojo cp where cp.name=:name")	
		}
)

public class CrudPojo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String phno;
	private String address;
	
	@Version int ver;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "CrudPojo [id=" + id + ", name=" + name + ", phno=" + phno + ", address=" + address + "]";
	}
	public CrudPojo(int id, String name, String phno, String address) {
		super();
		this.id = id;
		this.name = name;
		this.phno = phno;
		this.address = address;
	}
	public CrudPojo() {
		super();
		
	}
	
	
	

}
