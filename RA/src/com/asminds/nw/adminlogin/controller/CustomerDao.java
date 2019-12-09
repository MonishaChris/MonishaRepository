package com.asminds.nw.adminlogin.controller;

import java.util.List;

public interface CustomerDao {
	
	public boolean insert(CustomerDetails a);
	public boolean update(CustomerDetails a);
	public boolean delete(int s);
	List<CustomerDetails> viewAll();

}
