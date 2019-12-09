package com.tvm.model.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tvm.model.persistance.Order;

@Repository
public class OrderRepoImpl  implements OrderRepository{

	private SessionFactory sf;
	
	private Session getSession() {
		return sf.getCurrentSession();
	}
	
	@Autowired
	public OrderRepoImpl(SessionFactory sf) {
		super();
		this.sf = sf;
	}

	public Order add(Order e) {
		getSession().save(e);
		return e;
	}

	public Order delete(Order e) {
		/*Order e1=this.getById(e);*/
		if(e!=null)
			getSession().delete(e);
		return e;
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<Order> view() {
		return getSession().createQuery("from Order").list();
	}

	public Order update(Order e) {
		 getSession().saveOrUpdate(e);
		 return e;
	}

	public List<Order> getById(Order e) {
	return	getSession().createQuery("from Order e where e.location=" +e.getLocation()).list();
		
	}

	

	

}
