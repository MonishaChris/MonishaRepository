package com.tvm.model.repository;

import java.util.List;

import org.springframework.stereotype.Component;
import com.tvm.model.persistance.Cart;
import com.tvm.model.persistance.Customer;


public interface CartRepository {
	
	public Cart add(Cart e);
	public Cart delete(Cart e);
	public List<Cart> view();
	public Cart update(Cart e); 
	public List<Cart> getById(Cart e);
	
	
}
