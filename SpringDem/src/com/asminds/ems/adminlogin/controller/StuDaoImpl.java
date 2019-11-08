package com.asminds.ems.adminlogin.controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StuDaoImpl implements StuDao {

	public boolean insert(CrudPojo s) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		ss.save(s);
		tx.commit();
		ss.close();
		sf.close();
		return true;
	}

	public boolean delete(int s) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		Object object = ss.load(CrudPojo.class, new Integer(s));
		CrudPojo po = (CrudPojo) object;
		ss.delete(po);
		tx.commit();
		ss.close();
		sf.close();
		return true;

	}


	public List<CrudPojo> viewall() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		Query q = ss.createQuery("from CrudPojo o");
		List<CrudPojo> l = q.list();
		System.out.println("Total numbers=" + l.size());
		System.out.println(l.toString());

		return l;
	}

	@Override
	public boolean update(CrudPojo a) {
		
		int i = a.getStuid();

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Object o = session.load(CrudPojo.class, new Integer(i));
		CrudPojo s = (CrudPojo) o;

		Transaction tx = session.beginTransaction();

		s.setStuname(a.getStuname());
		s.setStuaddress(a.getStuaddress());

		tx.commit();

		System.out.println("Object Updated successfully.....!!");
		session.close();
		factory.close();
		return true;
	}

}
