package com.asminds.crud;



import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;



public class HCriteria {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Criteria crt=session.createCriteria(CrudPojo.class);
		Criterion crn=Restrictions.eq("id", new Integer(6));
		
		crt.add(crn);
		List l=crt.list();
		System.out.println("List total size.."+l.size());
		Iterator itr=l.iterator();
		
		while(itr.hasNext())
		{
			CrudPojo c=(CrudPojo)itr.next();
			System.out.println(c.getId());
			System.out.println(c.getName());
			System.out.println(c.getPhno());
			System.out.println(c.getAddress());
			System.out.println("-------------------------------");
		}
session.close();
factory.close();
		
	}

}
