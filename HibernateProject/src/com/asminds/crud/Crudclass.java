package com.asminds.crud;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Crudclass {
	void Insert() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		CrudPojo c = new CrudPojo();
		c.setName("ramya");
		c.setPhno("9597348533");
		c.setAddress("salem");

		Transaction tx = session.beginTransaction();
		session.save(c);
		System.out.println(c);
		System.out.println("object saved successfully");
		tx.commit();
		session.close();
		factory.close();
	}

	void Update() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Object o = session.load(CrudPojo.class, new Integer(1));

		CrudPojo c = (CrudPojo) o;
		List<CrudPojo> li = (List<CrudPojo>) session.createQuery("from CrudPojo t where t.id=1");
		Transaction tx = session.beginTransaction();

		c.setName("mithra");
		c.setPhno("987654321");
		c.setAddress("chennai");
		session.update(c);

		System.out.println("OBJECT UPDATED SUCCESSFULLY");
		tx.commit();
		session.close();
		factory.close();

	}

	void Delete() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Object o = session.load(CrudPojo.class, new Integer(5));
		CrudPojo p = (CrudPojo) o;

		Transaction tx = session.beginTransaction();
		session.delete(p);
		System.out.println("object deleted successfully...");
		tx.commit();
		session.close();
		factory.close();

	}

	void Select() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Object o = session.load(CrudPojo.class, new Integer(4));
		CrudPojo c = (CrudPojo) o;
		System.out.println("Loaded object product name is__" + c.getId() + " " + c.getName() + " " + c.getPhno() + " "
				+ c.getAddress());

		System.out.println("Object loaded successfully...");

		session.close();
		factory.close();

	}

	void getdata() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		CrudPojo p = session.get(CrudPojo.class, new Integer(3));
		System.out.println(session.get(CrudPojo.class, new Integer(9)));

		// user understanding ,for loading transaction scope is not necessary..

		System.out.println("Get object CrudPojo:" + p);
		System.out.println("object get successfully");
		session.close();
		factory.close();

	}

	void LoadData() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		try {
			CrudPojo c = session.load(CrudPojo.class, new Integer(3));

			System.out.println("Loaded object CrudPojo:" + c);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("object loaded successfully..");
		session.close();
		factory.close();
	}

	public static void main(String[] args) {
		Crudclass n = new Crudclass();
		n.Insert();
		// n.Update();
		// n.Delete();
		// n.Select();
		// n.getdata();
		// n.LoadData();
	}
}
