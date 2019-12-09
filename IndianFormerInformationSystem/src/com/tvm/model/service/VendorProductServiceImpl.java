package com.tvm.model.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tvm.model.repository.Customer;
import com.tvm.model.repository.Vendor;
import com.tvm.model.repository.VendorProduct;
import com.tvm.model.repository.VendorProduct;
import com.tvm.model.repository.VendorProductRepoImpl;
import com.tvm.model.repository.VendorProductRepository;

@Service
@Transactional
public class VendorProductServiceImpl implements VendorProductService {

	
	VendorProductRepository repo;
	@Autowired
	public VendorProductServiceImpl(VendorProductRepository repo) {
		this.repo = repo;
	}
	public boolean add(VendorProduct v) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		ss.save(v);
		tx.commit();
		ss.close();
		sf.close();
		return true;
	}
	public boolean delete(int v) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		Object object = ss.load(VendorProduct.class, new Integer(v));
		VendorProduct po = (VendorProduct) object;
		ss.delete(po);
		tx.commit();
		ss.close();
		sf.close();
		return true;
	}
	public List<VendorProduct> view() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		Query q = ss.createQuery("from VendorProduct o");
		List<VendorProduct> l = q.list();
		System.out.println("Total numbers=" + l.size());
		System.out.println(l.toString());
		return l;
	}
	public boolean update(VendorProduct a) {
		int i = a.getVendorid();
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Object o = session.load(VendorProduct.class, new Integer(i));
		VendorProduct s = (VendorProduct) o;
		Transaction tx = session.beginTransaction();
		s.setVendorproductid(a.getVendorproductid());
		s.setStock(a.getStock());
		s.setProductname(a.getProductname());
		s.setPrice(a.getPrice());
		tx.commit();
		System.out.println("Object Updated successfully.....!!");
		session.close();
		factory.close();
		return true;
	}
	public List<VendorProduct> getById(VendorProduct e) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		Query q = ss.createQuery("from VendorProduct o");
		List<VendorProduct> l = q.list();
		System.out.println("Total numbers=" + l.size());
		System.out.println(l.toString());
		return l;
	}
	public List<VendorProduct> getObjectById(VendorProduct e) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		Query q = ss.createQuery("from VendorProduct o");
		List<VendorProduct> l = q.list();
		System.out.println("Total numbers=" + l.size());
		System.out.println(l.toString());
		return l;
	}
	

}
