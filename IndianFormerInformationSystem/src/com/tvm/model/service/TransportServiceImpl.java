package com.tvm.model.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tvm.model.repository.Transport;

@Service
@Transactional
public class TransportServiceImpl implements TransportService {

	public boolean add(Transport v) {
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
		Object object = ss.load(Transport.class, new Integer(v));
		Transport po = (Transport) object;
		ss.delete(po);
		tx.commit();
		ss.close();
		sf.close();
		return true;
	}
	public List<Transport> view() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		Query q = ss.createQuery("from Transport o");
		List<Transport> l = q.list();
		System.out.println("Total numbers=" + l.size());
		System.out.println(l.toString());
		return l;
		}
	public boolean update(Transport a) {
		int i = a.getId();
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Object o = session.load(Transport.class, new Integer(i));
		Transport s = (Transport) o;
		Transaction tx = session.beginTransaction();
		s.setDrivername(a.getDrivername());
		s.setMobile(a.getMobile());
		s.setVehicletype(a.getVehicletype());
		s.setStreet(a.getStreet());
		s.setLocation(a.getLocation());
		s.setCity(a.getCity());
		s.setPincode(a.getPincode());
		s.setState(a.getState());
		tx.commit();
		System.out.println("Object Updated successfully.....!!");
		session.close();
		factory.close();
		return true;
	}
	public List<Transport> getById(Transport e) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		Query q = ss.createQuery("from Transport o");
		List<Transport> l = q.list();
		System.out.println("Total numbers=" + l.size());
		System.out.println(l.toString());
		return l;
	}
	public List<Transport> updatebyid(int id) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		
		SessionFactory sf=con.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		String Hql="from Transport where id=:Monisha";
		Query query=s.createQuery(Hql);
		query.setParameter("Monisha", id);
		
		List<Transport> emp=query.list();
		
		tx.commit();
		s.close();
		return emp;
	}

	public int updatenewvalues(Transport emp) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		
		SessionFactory sf=con.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		String Hql="update Transport set drivername=:drivername,vehicletype=:vehicletype,mobile=:mobile,location=:location,street=:street,city=:city,state=:state,pincode=:pincode where id=:id";
		Query query=s.createQuery(Hql);
		query.setParameter("id", emp.getId());
		query.setParameter("drivername", emp.getDrivername());
		query.setParameter("vehicletype", emp.getVehicletype());
		query.setParameter("mobile", emp.getMobile());
		query.setParameter("location", emp.getLocation());
		query.setParameter("street", emp.getStreet());
		query.setParameter("city", emp.getCity());
		query.setParameter("state", emp.getState());
		query.setParameter("pincode", emp.getPincode());
		int result=query.executeUpdate();
		System.out.println(result +" Row Updated");
		tx.commit();
		s.close();
		return result;
	}

	public int deletebyid(int id) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		
		SessionFactory sf=con.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		String Hql="delete from Transport where id=:Monisha";
		Query query=s.createQuery(Hql);
		query.setParameter("Monisha", id);
		
		int result=query.executeUpdate();
		System.out.println(result +" Row Deleted");
		
		
		tx.commit();
		s.close();
		return result;
	}
	
	
/*	public boolean getById(int id) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		Query q = ss.createQuery("from Transport o");
		List<Transport> l = q.list();
		System.out.println("Total numbers=" + l.size());
		System.out.println(l.toString());
		return id;
	}*/
	
}
