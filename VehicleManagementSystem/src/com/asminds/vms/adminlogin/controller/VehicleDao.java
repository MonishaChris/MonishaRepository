package com.asminds.vms.adminlogin.controller;

import java.util.List;

public interface VehicleDao {
	
	public boolean insert(VehiclePojo v);
	public boolean delete(int v);
	public List<VehiclePojo>  viewall();
	public boolean update(VehiclePojo a);

}
