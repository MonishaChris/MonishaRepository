package com.tvm.model.service;

import java.util.List;

import com.tvm.model.repository.Product;


public interface ProductService {
	
	public boolean add(Product v);
	public boolean delete(int v);
	public List<Product>  view();
	public boolean update(Product a);
	public List<Product> getById(Product e);

	/*public Product add(Product e);
	public Product delete(Product e);
	public List<Product> view();
	public Product update(Product e); 
	public List<Product> getById(Product e);*/

	
}
