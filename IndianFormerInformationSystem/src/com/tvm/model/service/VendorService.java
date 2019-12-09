package com.tvm.model.service;

import java.util.List;

import com.tvm.model.repository.Vendor;


public interface VendorService {
	
	public boolean add(Vendor v);
	public boolean delete(int v);
	public List<Vendor>  view();
	public boolean update(Vendor a);
	public List<Vendor> getById(Vendor e);
	public List<Vendor> getByIdAndPassword(Vendor e);

	/*public Vendor add(Vendor e);
	public Vendor delete(Vendor e);
	public List<Vendor> view();
	public Vendor update(Vendor e); 
	public List<Vendor> getById(Vendor e);
	public List<Vendor> getbyIdAndPassword(Vendor e);
	*/
}
