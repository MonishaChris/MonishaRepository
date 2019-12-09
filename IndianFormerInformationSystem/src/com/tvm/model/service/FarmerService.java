package com.tvm.model.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.tvm.model.repository.Customer;
import com.tvm.model.repository.Farmer;


public interface FarmerService {
	
	public boolean add(Farmer v);
	public boolean delete(int v);
	public List<Farmer>  view();
	public boolean update(Farmer a);
	public List<Farmer> getById(Farmer e);
	public List<Farmer> getByIdAndPassword(Farmer e);

	//public boolean add(Farmer e);
	//public Farmer delete(Farmer e);
	//public List<Farmer> view();
	//public Farmer update(Farmer e); 
	//public List<Farmer> getById(Farmer e);
	//public List<Farmer> getbyIdAndPassword(Farmer e);
	
}
