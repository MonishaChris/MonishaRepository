package com.asminds.hibernate.demo;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeRecord {
	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sesfac=con.buildSessionFactory();
		Session ses=sesfac.openSession();
		/*Object o=ses.load(Employee.class, new Integer(101)); //delete
		Employee e=(Employee)o;
		
		System.out.println("Student is calling with get()");        
		//e = (Employee) ses.get(Employee.class,new Integer(101));    
		System.out.println("Student called with get()");
		System.out.println("Printing Student Name___"+e.getId());        
		System.out.println("Printing Student Name___"+e.getEmpname());*/
		Query qry = ses.createQuery("from Employee p");

		List l =qry.list();
		System.out.println("Total Number Of Records : "+l.size());
		Iterator it = l.iterator();

		while(it.hasNext())
		{
			Object o = (Object)it.next();
			Employee p = (Employee)o;
			System.out.println("Product id : "+p.getId());
			System.out.println("Product Name : "+p.getEmpname());
			System.out.println("Product Price : "+p.getSalary());
			System.out.println("----------------------");
		}		
		
		//Employee e=new Employee();
		//e.setId(103);2
		//e.setEmpname("Selvi");
		//e.setEmpdesg("Oracle-Developer");
		//e.setSalary(50000f);
		Transaction t=ses.beginTransaction();
		//ses.delete(e);
		//ses.save(e);
		//System.out.println("Loaded....."+e.getId()+" "+e.getEmpname()+" "+e.getEmpdesg()+" "+e.getSalary());
		//System.out.println("Successfully id is loaded");
		t.commit();
		ses.close();
		sesfac.close();
	}
	

}
