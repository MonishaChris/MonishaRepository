package com.asminds.immutable;

public class Company {
	static Company com=new Company();
	private Company() {}
	synchronized static Company getInstance() {
		return com;
	}
	

}
