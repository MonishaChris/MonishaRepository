package com.tvm.model.service;

import java.util.List;

import com.tvm.model.repository.VendorProduct;


public interface VendorProductService {
	
	public boolean add(VendorProduct v);
	public boolean delete(int v);
	public List<VendorProduct>  view();
	public boolean update(VendorProduct a);
	public List<VendorProduct> getById(VendorProduct e);
	public List<VendorProduct> getObjectById(VendorProduct e);

	/*public VendorProduct add(VendorProduct e);
	public VendorProduct delete(VendorProduct e);
	public List<VendorProduct> view();
	public VendorProduct update(VendorProduct e); 
	public List<VendorProduct> getById(VendorProduct e);
	public VendorProduct getObjectById(VendorProduct e);*/
	
}
