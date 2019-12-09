package com.tvm.model.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.tvm.model.persistance.Vendor;


public interface VendorRepository {
	public Vendor add(Vendor e);
	public Vendor delete(Vendor e);
	public List<Vendor> view();
	public Vendor update(Vendor e); 
	public List<Vendor> getById(Vendor e);
	public List<Vendor> getbyIdAndPassword(Vendor e);
}
