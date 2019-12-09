package com.tvm.model.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tvm.model.persistance.Customer;

@Repository
public class CustomerRepoImpl  implements CustomerRepository{

	private SessionFactory sf;
	
	private Session getSession() {
		return sf.getCurrentSession();
	}
	
	@Autowired
	public CustomerRepoImpl(SessionFactory sf) {
		super();
		this.sf = sf;
	}

	public Customer add(Customer e) {
		getSession().save(e);
		return e;
	}

	public Customer delete(Customer e) {
		/*Customer e1=this.getById(e);*/
		if(e!=null)
			getSession().delete(e);
		return e;
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<Customer> view() {
		return getSession().createQuery("from Customer").list();
	}

	public Customer update(Customer e) {
		 getSession().saveOrUpdate(e);
		 return e;
	}

	public List<Customer> getById(Customer e) {
	return	getSession().createQuery("from Customer e where e.id=" +e.getCustomerid()).list();
		
	}
public List<Customer> getbyIdAndPassword(Customer e) {
		
		Query qry = getSession().createQuery("from Customer where customerid=:customerid and password=:password");
			
						qry.setParameter("customerid", e.getCustomerid());
						qry.setParameter("password", e.getPassword()); 
						List l = qry.list();
						return l;
	}
	

}
