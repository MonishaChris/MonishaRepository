package com.tvm.model.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tvm.model.repository.Product;
import com.tvm.model.repository.ProductRepository;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	
	ProductRepository repo;
	@Autowired
	public ProductServiceImpl(ProductRepository repo) {
		this.repo = repo;
	}

	public boolean add(Product v) {
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
		Object object = ss.load(Product.class, new Integer(v));
		Product po = (Product) object;
		ss.delete(po);
		tx.commit();
		ss.close();
		sf.close();
		return true;
	}
	public List<Product> view() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		Query q = ss.createQuery("from Product o");
		List<Product> l = q.list();
		System.out.println("Total numbers=" + l.size());
		System.out.println(l.toString());
		return l;
	}
	public boolean update(Product a) {
		int i = a.getProductid();
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Object o = session.load(Product.class, new Integer(i));
		Product s = (Product) o;
		Transaction tx = session.beginTransaction();
		s.setFarmerid(a.getFarmerid());
		s.setProductname(a.getProductname());
		s.setCategory(a.getCategory());
		s.setStock(a.getStock());
		s.setPrice(a.getPrice());
		tx.commit();
		System.out.println("Object Updated successfully.....!!");
		session.close();
		factory.close();
		return true;
	}
	public List<Product> getById(Product e) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		Query q = ss.createQuery("from Product o");
		List<Product> l = q.list();
		System.out.println("Total numbers=" + l.size());
		System.out.println(l.toString());
		return l;
	}
}
