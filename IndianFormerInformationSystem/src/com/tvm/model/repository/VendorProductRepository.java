package com.tvm.model.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.tvm.model.persistance.VendorProduct;


public interface VendorProductRepository {
	public VendorProduct add(VendorProduct e);
	public VendorProduct delete(VendorProduct e);
	public List<VendorProduct> view();
	public VendorProduct update(VendorProduct e); 
	public List<VendorProduct> getById(VendorProduct e);
	public VendorProduct getObjectById(VendorProduct e);
}
