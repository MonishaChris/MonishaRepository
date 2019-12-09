package com.tvm.model.service;

import java.util.List;

import com.tvm.model.repository.Cart;
import com.tvm.model.repository.Customer;


public interface CustomerService {
	
	public boolean add(Customer v);
	public boolean delete(int v);
	public List<Customer>  view();
	public boolean update(Customer a);
	public List<Customer> getById(Customer e);
	public List<Customer> getByIdAndPassword(Customer e);
	
}
