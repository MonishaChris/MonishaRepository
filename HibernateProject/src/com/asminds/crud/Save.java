package com.asminds.crud;

import org.hibernate.cfg.Configuration;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class Save {
	
	public static void main(String[] args) {
		
		Employee e = new Employee(123, "spring", "madurai");
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(e);
		tx.commit();
		
		session.close();
		factory.close();
		System.out.println(" Data has been saved");
	}

}
