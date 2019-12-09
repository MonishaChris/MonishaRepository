package com.tvm.model.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tvm.model.persistance.Product;

@Repository
public class ProductRepoImpl  implements ProductRepository{

	private SessionFactory sf;
	
	private Session getSession() {
		return sf.getCurrentSession();
	}
	
	@Autowired
	public ProductRepoImpl(SessionFactory sf) {
		super();
		this.sf = sf;
	}

	public Product add(Product e) {
		getSession().save(e);
		return e;
	}

	public Product delete(Product e) {
		/*Product e1=this.getById(e);*/
		if(e!=null)
			getSession().delete(e);
		return e;
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<Product> view() {
		return getSession().createQuery("from Product").list();
	}

	public Product update(Product e) {
		 getSession().saveOrUpdate(e);
		 return e;
	}

	public List<Product> getById(Product e) {
	return	getSession().createQuery("from Product e where e.stock=" +e.getStock()).list();
		
	}

	

	

}
