package com.tvm.model.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.tvm.model.persistance.Order;


public interface OrderRepository {
	public Order add(Order e);
	public Order delete(Order e);
	public List<Order> view();
	public Order update(Order e); 
	public List<Order> getById(Order e);
	
	
}
