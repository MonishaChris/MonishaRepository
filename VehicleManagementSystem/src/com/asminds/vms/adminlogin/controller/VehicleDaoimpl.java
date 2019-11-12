package com.asminds.vms.adminlogin.controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class VehicleDaoimpl implements VehicleDao{
	public boolean insert(VehiclePojo s) {
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
		Object object = ss.load(VehiclePojo.class, new Integer(s));
		VehiclePojo po = (VehiclePojo) object;
		ss.delete(po);
		tx.commit();
		ss.close();
		sf.close();
		return true;

	}


	public List<VehiclePojo> viewall() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		Query q = ss.createQuery("from VehiclePojo o");
		List<VehiclePojo> l = q.list();
		System.out.println("Total numbers=" + l.size());
		System.out.println(l.toString());

		return l;
	}

	@Override
	public boolean update(VehiclePojo a) {
		
		int i = a.getVehicleid();

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Object o = session.load(VehiclePojo.class, new Integer(i));
		VehiclePojo s = (VehiclePojo) o;

		Transaction tx = session.beginTransaction();

		s.setVehiclename(a.getVehiclename());
		s.setModel(a.getModel());
		s.setManufacturedyear(a.getManufacturedyear());
		s.setColor(a.getColor());
		s.setCost(a.getCost());

		tx.commit();

		System.out.println("Object Updated successfully.....!!");
		session.close();
		factory.close();
		return true;
	}

}
