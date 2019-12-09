package com.tvm.model.repository;

import java.util.List;

import com.tvm.model.persistance.Transport;


public interface TransportRepository {
	public Transport add(Transport e);
	public Transport delete(Transport e);
	public List<Transport> view();
	public Transport update(Transport e); 
	public List<Transport> getById(Transport e);
	public Transport getById(int id);
}
