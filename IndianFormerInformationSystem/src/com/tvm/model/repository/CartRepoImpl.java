package com.tvm.model.repository;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tvm.model.persistance.Cart;

@Repository
public class CartRepoImpl  implements CartRepository{

	private SessionFactory sf;
	
	private Session getSession() {
		return sf.getCurrentSession();
	}
	
	@Autowired
	public CartRepoImpl(SessionFactory sf) {
		super();
		this.sf = sf;
	}

	public Cart add(Cart e) {
		getSession().save(e);
		return e;
	}

	public Cart delete(Cart e) {
		/*Cart e1=this.getById(e);*/
		if(e!=null)
			getSession().delete(e);
		return e;
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<Cart> view() {
		return getSession().createQuery("from Cart").list();
	}

	public Cart update(Cart e) {
		getSession().saveOrUpdate(e);
		return e;
	}

	public List<Cart> getById(Cart e) {
	return	getSession().createQuery("from Cart e where e.cartid=" +e.getCartid()).list();
		
	}

	

	

}
