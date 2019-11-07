package com.asminds.hibernate.demo;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class EmployeeRecord {
	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sesfac=con.buildSessionFactory();
		Session ses=sesfac.openSession();
		ses.load(Employee.class,new Float(101));
		Criteria crit = ses.createCriteria(Employee.class);
		
	//  ProjectionList projList = Projections.projectionList();
	//  projList.add(Projections.max("salary"));
	//	projList.add(Projections.min("salary"));
	//	projList.add(Projections.avg("salary"));
	//	projList.add(Projections.countDistinct("empname"));
	//	crit.setProjection(projList);		
		//Criterion c1=Restrictions.gt("salary", new Float(70000)); //greater than
		//Criterion c1=Restrictions.lt("salary", new Float(70000)); //lesser than
		//Criterion c1=Restrictions.eq("salary", new Float(70000)); //equal to
		//Criterion c1=Restrictions.ne("salary", new Float(70000)); //not equalto
		//Criterion c1=Restrictions.ilike("empname", "monisha"); //case-sensitive
		//Criterion c1=Restrictions.between("salary",50000, 100000);
		//crit.addOrder(Order.asc("salary"));  //asc order
		//crit.addOrder(Order.desc("salary")); //desc order
		//crit.setProjection(Projections.rowCount()); //row count
		// To get records matching with OR conditions
		//LogicalExpression orExp = Restrictions.or(salary, name);
		//c1.add( orExp );

		// To get records matching with AND conditions
		//LogicalExpression andExp = Restrictions.and(salary, name);
		//cr.add( andExp );
		
		//crit.add(c1);
		List l = crit.list();
		Iterator it = l.iterator();
		while(it.hasNext())
		{
		Object o = it.next();
		Employee e = (Employee)o;
		System.out.println(e.id+" "+e.empname+" "+e.salary+" "+e.Empdesg);
		}
		
		//price is our pojo class variable
		 // adding criterion object to criteria class object
		//Object o=ses.load(Employee.class, new Integer(70000)); //delete
		//Employee e=(Employee)o;
		
		System.out.println("Student is calling with get()");        
//		Query qry = ses.createQuery("from Employee p");
//
//		List l =qry.list();
//		System.out.println("Total Number Of Records : "+l.size());
//		Iterator it = l.iterator();
//
//		while(it.hasNext())
//		{
//			Object o = (Object)it.next();
//			Employee p = (Employee)o;
//			System.out.println("Product id : "+p.getId());
//			System.out.println("Product Name : "+p.getEmpname());
//			System.out.println("Product Price : "+p.getSalary());
//			System.out.println("----------------------");
//		}		
//		
		//Employee e=new Employee();
		//e.setId(106);
		//e.setEmpname("Monish");
		//e.setEmpdesg("Spring-Developer");
		//e.setSalary(100000f);
		Transaction t=ses.beginTransaction();
		//ses.delete(e);
		//ses.save(e);
		//System.out.println("Loaded....."+e.getId()+" "+e.getEmpname()+" "+e.getEmpdesg()+" "+e.getSalary());
		System.out.println("Successfully id is loaded");
		t.commit();
		ses.close();
		sesfac.close();
	}
	

}
