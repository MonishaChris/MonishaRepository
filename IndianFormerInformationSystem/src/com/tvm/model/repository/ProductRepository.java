package com.tvm.model.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.tvm.model.persistance.Product;


public interface ProductRepository {
	public Product add(Product e);
	public Product delete(Product e);
	public List<Product> view();
	public Product update(Product e); 
	public List<Product> getById(Product e);
	
	
}
