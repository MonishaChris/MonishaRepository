package com.asminds.crud;



import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class NameQy {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");	          
	    SessionFactory factory=cfg.buildSessionFactory();  
	    Session session=factory.openSession();
	    
		Query query=session.getNamedQuery("CrudPojobyId");
	    query.setParameter("name", new String("Kumar"));
	    
	    List<CrudPojo> l=query.getResultList();
	    
	    Iterator<CrudPojo> itr=l.iterator();
	   
	    while(itr.hasNext())
	    {
	    	CrudPojo p =(CrudPojo)itr.next();
	    	System.out.println(p);
	    }
	        session.close();
	        factory.close();
	      
	}
}
