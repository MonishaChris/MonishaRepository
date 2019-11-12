package com.asminds.ems.adminlogin.controller;

import java.util.List;

public interface EmployeeDao {
	
	public boolean insert(EmployeePojo v);
	public boolean delete(int v);
	public List<EmployeePojo>  viewall();
	public boolean update(EmployeePojo a);

}
