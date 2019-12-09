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
import com.tvm.model.repository.Vendor;
import com.tvm.model.repository.VendorRepoImpl;
import com.tvm.model.repository.VendorRepository;

@Service
@Transactional
public class VendorServiceImpl implements VendorService {

	
	VendorRepository repo;
	@Autowired
	public VendorServiceImpl(VendorRepository repo) {
		this.repo = repo;
	}
	public boolean add(Vendor v) {
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
		Object object = ss.load(Vendor.class, new Integer(v));
		Vendor po = (Vendor) object;
		ss.delete(po);
		tx.commit();
		ss.close();
		sf.close();
		return true;
	}
	public List<Vendor> view() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		Query q = ss.createQuery("from Vendor o");
		List<Vendor> l = q.list();
		System.out.println("Total numbers=" + l.size());
		System.out.println(l.toString());
		return l;
	}
	public boolean update(Vendor a) {
		int i = a.getVendorid();
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Object o = session.load(Vendor.class, new Integer(i));
		Vendor s = (Vendor) o;
		Transaction tx = session.beginTransaction();
		s.setCity(a.getCity());
		s.setContactno(a.getContactno());
		s.setMailId(a.getMailId());
		s.setName(a.getName());
		s.setPassword(a.getPassword());
		s.setPincode(a.getPincode());
		s.setState(a.getState());
		s.setStreet(a.getStreet());
		s.setvendorid(a.getvendorid());
		tx.commit();
		System.out.println("Object Updated successfully.....!!");
		session.close();
		factory.close();
		return true;
	}
	public List<Vendor> getById(Vendor e) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		Query q = ss.createQuery("from Vendor o");
		List<Vendor> l = q.list();
		System.out.println("Total numbers=" + l.size());
		System.out.println(l.toString());
		return l;
	}
	public List<Vendor> getByIdAndPassword(Vendor e) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		Query q = ss.createQuery("from Vendor o");
		List<Vendor> l = q.list();
		System.out.println("Total numbers=" + l.size());
		System.out.println(l.toString());
		return l;
	}
	

}
