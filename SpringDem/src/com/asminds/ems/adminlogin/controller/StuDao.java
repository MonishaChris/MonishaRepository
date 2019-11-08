package com.asminds.ems.adminlogin.controller;

import java.util.List;

public interface StuDao {
	
	public boolean insert(CrudPojo s);
	public boolean delete(int s);
	public List<CrudPojo> viewall();
	public boolean update(CrudPojo a);

}
