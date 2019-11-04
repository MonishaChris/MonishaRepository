package com.asminds.singletondemo;

public class Company {

	static Company com=new Company();
	static int id;
	
	private Company() {
		
	}
	
	synchronized static Company getInstance() {
		return com;
		
	}
}
