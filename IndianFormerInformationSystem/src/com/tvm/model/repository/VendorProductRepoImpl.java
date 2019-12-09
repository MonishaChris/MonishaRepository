package com.tvm.model.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tvm.model.persistance.VendorProduct;

@Repository
public class VendorProductRepoImpl  implements VendorProductRepository{

	private SessionFactory sf;
	
	private Session getSession() {
		return sf.getCurrentSession();
	}
	
	@Autowired
	public VendorProductRepoImpl(SessionFactory sf) {
		super();
		this.sf = sf;
	}

	public VendorProduct add(VendorProduct e) {
		getSession().save(e);
		return e;
	}

	public VendorProduct delete(VendorProduct e) {
		/*VendorProduct e1=this.getById(e);*/
		if(e!=null)
			getSession().delete(e);
		return e;
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<VendorProduct> view() {
		return getSession().createQuery("from VendorProduct").list();
	}

	public VendorProduct update(VendorProduct e) {
		 getSession().saveOrUpdate(e);
		 return e;
	}

	public List<VendorProduct> getById(VendorProduct e) {
		
	return	getSession().createQuery("from VendorProduct e where e.id=" +e.getVendorproductid()).list();
		
	}

	public VendorProduct getObjectById(VendorProduct e) {
		return  getSession().get(VendorProduct.class, e.getVendorproductid());
	
	}
	

	

}
