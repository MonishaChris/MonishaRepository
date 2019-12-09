package com.tvm.model.service;

import java.util.List;
import com.tvm.model.repository.Cart;


public interface CartService {
	
	public boolean add(Cart v);
	public boolean delete(int v);
	public List<Cart>  view();
	public boolean update(Cart a);
	public List<Cart> getById(Cart e);

}
