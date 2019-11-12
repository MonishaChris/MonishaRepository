package com.asminds.hms.adminlogin.controller;

import java.util.List;

public interface HospitalDao {
	
	public boolean insert(HospitalPojo h);
	public boolean delete(int d);
	public List<HospitalPojo> viewall();
	public boolean update(HospitalPojo h);

}
