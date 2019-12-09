package com.tvm.model.service;

import java.util.List;

import com.tvm.model.repository.Transport;


public interface TransportService {
	
	public boolean add(Transport v);
	public boolean delete(int v);
	public List<Transport>  view();
	public boolean update(Transport a);
	public List<Transport> getById(Transport e);
	//public boolean getById(int id);

	/*public Transport add(Transport e);
	public Transport delete(Transport e);
	public List<Transport> view();
	public Transport update(Transport e); 
	public List<Transport> getById(Transport e);
	public Transport getById(int id);*/

	
}
