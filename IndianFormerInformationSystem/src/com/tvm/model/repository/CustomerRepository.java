package com.tvm.model.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.tvm.model.persistance.Customer;


public interface CustomerRepository {
	public Customer add(Customer e);
	public Customer delete(Customer e);
	public List<Customer> view();
	public Customer update(Customer e); 
	public List<Customer> getById(Customer e);
	public List<Customer> getbyIdAndPassword(Customer e);
}
