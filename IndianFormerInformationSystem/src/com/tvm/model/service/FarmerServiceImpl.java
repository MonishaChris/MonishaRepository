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
import com.tvm.model.repository.Farmer;
import com.tvm.model.repository.FarmerRepoImpl;
import com.tvm.model.repository.FarmerRepository;

@Service
@Transactional
public class FarmerServiceImpl implements FarmerService {

	
	FarmerRepository repo;
	@Autowired
	public FarmerServiceImpl(FarmerRepository repo) {
		this.repo = repo;
	}
	public boolean add(Farmer v) {
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
		Object object = ss.load(Farmer.class, new Integer(v));
		Farmer po = (Farmer) object;
		ss.delete(v);
		tx.commit();
		ss.close();
		sf.close();
		return true;
	}
	public List<Farmer> view() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		Query q = ss.createQuery("from Farmer o");
		List<Farmer> l = q.list();
		System.out.println("Total numbers=" + l.size());
		System.out.println(l.toString());
		return l;
	}
	public boolean update(Farmer a) {
		int i = a.getFarmerid();
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Object o = session.load(Farmer.class, new Integer(i));
		Farmer s = (Farmer) o;
		Transaction tx = session.beginTransaction();
		s.setName(a.getName());
		s.setAddress(a.getAddress());
		s.setMailId(a.getMailId());
		s.setPassword(a.getPassword());
		s.setContactno(a.getContactno());
		tx.commit();
		System.out.println("Object Updated successfully.....!!");
		session.close();
		factory.close();
		return true;
	}
	public List<Farmer> getById(Farmer e) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		Query q = ss.createQuery("from Farmer o");
		List<Farmer> l = q.list();
		System.out.println("Total numbers=" + l.size());
		System.out.println(l.toString());
		return l;
	}
	public List<Farmer> getByIdAndPassword(Farmer e) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		Query q = ss.createQuery("from Farmer o");
		List<Farmer> l = q.list();
		System.out.println("Total numbers=" + l.size());
		System.out.println(l.toString());
		return l;
	}
}
