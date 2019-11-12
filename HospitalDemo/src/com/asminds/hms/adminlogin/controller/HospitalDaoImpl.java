package com.asminds.hms.adminlogin.controller;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HospitalDaoImpl implements HospitalDao {

	@Override
	public boolean insert(HospitalPojo h) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		s.save(h);
		tx.commit();
		sf.close();
		s.close();
		return true;
	}

	@Override
	public boolean delete(int d) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		Object object = ss.load(HospitalPojo.class, new Integer(d));
		HospitalPojo po = (HospitalPojo) object;
		ss.delete(po);
		tx.commit();
		ss.close();
		sf.close();
		return true;

		}

	@Override
	public List<HospitalPojo> viewall() {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Query q= s.createQuery("from HospitalPojo h");
		List<HospitalPojo> l=q.list();
		System.out.println("Total numbers=" +l.size());
		System.out.println(l.toString());
		return l;
	}

	@Override
	public boolean update(HospitalPojo h) {
		
		int i=h.getPatientid();
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Object o=s.load(HospitalPojo.class, new Integer(i));
		HospitalPojo p=(HospitalPojo)o;
		Transaction tx=s.beginTransaction();
		p.setPatientname(h.getPatientname());
		p.setAddress(h.getAddress());
		p.setContact(h.getContact());
		p.setDisease(h.getDisease());
		p.setDoctorid(h.getDoctorid());
		p.setDoctorname(h.getDoctorname());
		tx.commit();
		System.out.println("Updated Successfully......");
		s.close();
		sf.close();
	
		return true;
	}
	

}
