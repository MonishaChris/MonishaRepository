package com.tvm.model.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tvm.model.persistance.Farmer;

@Repository
public class FarmerRepoImpl  implements FarmerRepository{

	private SessionFactory sf;
	
	private Session getSession() {
		return sf.getCurrentSession();
	}
	
	@Autowired
	public FarmerRepoImpl(SessionFactory sf) {
		super();
		this.sf = sf;
	}

	public Farmer add(Farmer e) {
		getSession().save(e);
		return e;
	}

	public Farmer delete(Farmer e) {
		/*Farmer e1=this.getById(e);*/
		if(e!=null)
			getSession().delete(e);
		return e;
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<Farmer> view() {
		return getSession().createQuery("from Farmer").list();
	}

	public Farmer update(Farmer e) {
		 getSession().saveOrUpdate(e);
		 return e;
	}

	public List<Farmer> getById(Farmer e) {
	return	getSession().createQuery("from Farmer e where e.id=" +e.getFarmerid()).list();
		
	}

	public List<Farmer> getbyIdAndPassword(Farmer e) {
		
		Query qry = getSession().createQuery("from Farmer where farmerid=:farmerid and password=:password");
			
						qry.setParameter("farmerid", e.getFarmerid());
						qry.setParameter("password", e.getPassword()); 
						List l = qry.list();
						return l;
	}

}
