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
import com.tvm.model.repository.CustomerRepoImpl;
import com.tvm.model.repository.CustomerRepository;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {	
	CustomerRepository repo;
	@Autowired
	public CustomerServiceImpl(CustomerRepository repo) {
		this.repo = repo;
	}
	public boolean add(Customer v) {
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
		Object object = ss.load(Customer.class, new Integer(v));
		Customer po = (Customer) object;
		ss.delete(po);
		tx.commit();
		ss.close();
		sf.close();
		return true;
	}
	public List<Customer> view() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		Query q = ss.createQuery("from Customer o");
		List<Customer> l = q.list();
		System.out.println("Total numbers=" + l.size());
		System.out.println(l.toString());
		return l;
	}
	public boolean update(Customer a) {
		int i = a.getCustomerid();
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Object o = session.load(Customer.class, new Integer(i));
		Customer s = (Customer) o;
		Transaction tx = session.beginTransaction();
		s.setName(a.getName());
		s.setPassword(a.getPassword());
		s.setMailId(a.getMailId());
		s.setContactno(a.getContactno());
		s.setStreet(a.getStreet());
		s.setCity(a.getCity());
		s.setState(a.getState());
		s.setPincode(a.getPincode());
		tx.commit();
		System.out.println("Object Updated successfully.....!!");
		session.close();
		factory.close();
		return true;
	}
	public List<Customer> getById(Customer e) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		Query q = ss.createQuery("from Customer o");
		List<Customer> l = q.list();
		System.out.println("Total numbers=" + l.size());
		System.out.println(l.toString());
		return l;
	}

	public List<Customer> getByIdAndPassword(Customer e) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		Query q = ss.createQuery("from Customer o");
		List<Customer> l = q.list();
		System.out.println("Total numbers=" + l.size());
		System.out.println(l.toString());
		return l;
	}
}
