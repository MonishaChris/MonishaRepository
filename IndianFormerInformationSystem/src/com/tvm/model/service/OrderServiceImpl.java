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
import com.tvm.model.repository.Order;
import com.tvm.model.repository.OrderRepoImpl;
import com.tvm.model.repository.OrderRepository;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

	
	OrderRepository repo;
	@Autowired
	public OrderServiceImpl(OrderRepository repo) {
		this.repo = repo;
	}
	public boolean add(Order v) {
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
		Object object = ss.load(Order.class, new Integer(v));
		Order po = (Order) object;
		ss.delete(po);
		tx.commit();
		ss.close();
		sf.close();
		return true;
	}
	public List<Order> view() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		Query q = ss.createQuery("from Order o");
		List<Order> l = q.list();
		System.out.println("Total numbers=" + l.size());
		System.out.println(l.toString());
		return l;
	}
	public boolean update(Order a) {
		int i = a.getOrderid();
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Object o = session.load(Order.class, new Integer(i));
		Order s = (Order) o;
		Transaction tx = session.beginTransaction();
		s.setFarmerid(a.getFarmerid());
		s.setOrdername(a.getOrdername());
		s.setProductname(a.getProductname());
		s.setOrderdate(a.getOrderdate());
		s.setDeliverydate(a.getDeliverydate());
		s.setLocation(a.getLocation());
		s.setQuantity(a.getQuantity());
		s.setRate(a.getRate());
		s.setTotal(a.getTotal());
		tx.commit();
		System.out.println("Object Updated successfully.....!!");
		session.close();
		factory.close();
		return true;
	}
	public List<Order> getById(Order e) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		Query q = ss.createQuery("from Order o");
		List<Order> l = q.list();
		System.out.println("Total numbers=" + l.size());
		System.out.println(l.toString());
		return l;
	}
	

}
