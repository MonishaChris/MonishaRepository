package com.asminds.crud;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;


public class HProjection {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Criteria crt=session.createCriteria(CrudPojo.class);
		
		crt.setProjection(Projections.property("name"));
		
		List l=crt.list();
		Iterator itr=l.iterator();
		
		while(itr.hasNext()) {
			String s=(String)itr.next();
			System.out.println(s);
		}
session.close();
factory.close();
	}

}
