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
import com.tvm.model.repository.Cart;
import com.tvm.model.repository.CartRepository;

@Service
@Transactional
public class CartServiceImpl implements CartService {

	
	CartRepository repo;
	@Autowired
	public CartServiceImpl(CartRepository repo) {
		this.repo = repo;
	}
	public boolean add(Cart v) {
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
		Object object = ss.load(Cart.class, new Integer(v));
		Cart po = (Cart) object;
		ss.delete(po);
		tx.commit();
		ss.close();
		sf.close();
		return true;
	}
	public List<Cart> view() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		Query q = ss.createQuery("from Cart o");
		List<Cart> l = q.list();
		System.out.println("Total numbers=" + l.size());
		System.out.println(l.toString());
		return l;
	}
	public boolean update(Cart a) {
		int i = a.getCartid();
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Object o = session.load(Cart.class, new Integer(i));
		Cart s = (Cart) o;
		Transaction tx = session.beginTransaction();
		s.setCustomerid(a.getCustomerid());
		s.setProductname(a.getProductname());
		s.setQuantity(a.getQuantity());
		s.setRate(a.getRate());
		s.setTotal(a.getTotal());
		s.setType(a.getType());
		tx.commit();
		System.out.println("Object Updated successfully.....!!");
		session.close();
		factory.close();
		return true;
	}
	public List<Cart> getById(Cart e) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		Query q = ss.createQuery("from Cart o");
		List<Cart> l = q.list();
		System.out.println("Total numbers=" + l.size());
		System.out.println(l.toString());
		return l;
	}
	

}
