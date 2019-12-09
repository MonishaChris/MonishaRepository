package com.tvm.model.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.tvm.model.persistance.Farmer;


public interface FarmerRepository {
	public Farmer add(Farmer e);
	public Farmer delete(Farmer e);
	public List<Farmer> view();
	public Farmer update(Farmer e); 
	public List<Farmer> getById(Farmer e);
	public List<Farmer> getbyIdAndPassword(Farmer e);
	
}
