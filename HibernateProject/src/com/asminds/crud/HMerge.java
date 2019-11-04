package com.asminds.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HMerge 
{
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 

		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tx=	session.beginTransaction();
		CrudPojo c=(CrudPojo)session.get(CrudPojo.class,2);
		System.out.println("student object loaded:"+ c);
		tx.commit();
		
		Transaction tx1=session.beginTransaction();
		CrudPojo c1=(CrudPojo)session.merge(c);
		System.out.println("before commiting merge transaction:"+c);
		System.out.println(c1.equals(c));
		
		c1.setName("ashaa");
		tx1.commit();
		System.out.println("after commiting merge transaction:"+c1);
		session.close();
		factory.close();
		
	}

}
