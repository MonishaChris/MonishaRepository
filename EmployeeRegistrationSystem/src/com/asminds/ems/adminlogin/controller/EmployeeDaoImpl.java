package com.asminds.ems.adminlogin.controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDaoImpl implements EmployeeDao {
	public boolean insert(EmployeePojo s) {
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
		Object object = ss.load(EmployeePojo.class, new Integer(s));
		EmployeePojo po = (EmployeePojo) object;
		ss.delete(po);
		tx.commit();
		ss.close();
		sf.close();
		return true;

	}


	public List<EmployeePojo> viewall() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		Query q = ss.createQuery("from EmployeePojo o");
		List<EmployeePojo> l = q.list();
		System.out.println("Total numbers=" + l.size());
		System.out.println(l.toString());

		return l;
	}

	@Override
	public boolean update(EmployeePojo a) {
		
		int i = a.getEmpid();

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Object o = session.load(EmployeePojo.class, new Integer(i));
		EmployeePojo s = (EmployeePojo) o;
		Transaction tx = session.beginTransaction();
		s.setEmpfirstname(a.getEmpfirstname());
		s.setEmplastname(a.getEmplastname());
		s.setEmpusername(a.getEmpusername());
		s.setEmppassword(a.getEmppassword());
		s.setEmpaddress(a.getEmpaddress());
		s.setEmpcontact(a.getEmpcontact());

		tx.commit();

		System.out.println("Object Updated successfully.....!!");
		session.close();
		factory.close();
		return true;
	}


}
