package com.asminds.nw.adminlogin.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.mapping.Map;

public class CustomerDaoImpl implements CustomerDao {

	@Override
	public boolean insert(CustomerDetails a) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		//Criteria crit = s.createCriteria(CustomerDetails.class);

		//  ProjectionList projList = Projections.projectionList();
		//  projList.add(Projections.max("amount"));
			//projList.add(Projections.min("salary"));
			//projList.add(Projections.avg("salary"));
			//projList.add(Projections.countDistinct("empname"));
		//	crit.setProjection(projList);		
		s.save(a);
		tx.commit();
		sf.close();
		s.close();

		return true;
	}

	@Override
	public boolean update(CustomerDetails a) {
        int i=a.getCustid();
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Object o=s.load(CustomerDetails.class, new Integer(i));
		CustomerDetails p=(CustomerDetails)o;
		Transaction tx=s.beginTransaction();
		p.setCustname(a.getCustname());;
		p.setCustaddress(a.getCustaddress());
		p.setCustcontact(a.getCustcontact());
		p.setCustpackage(a.getCustpackage());
		p.setOffer(a.getOffer());
		p.setPlanyear(a.getPlanyear());
		p.setAmount(a.getAmount());
	
		tx.commit();
		System.out.println("Updated Successfully......");
		s.close();
		sf.close();
	
		return true;
	}

	@Override
	public boolean delete(int s) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		Object object = ss.load(CustomerDetails.class,new Integer(s));
		CustomerDetails po = (CustomerDetails) object;
		ss.delete(po);
		tx.commit();
		ss.close();
		sf.close();
		return true;

	}

	@Override
	public List<CustomerDetails> viewAll() {
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sesfac=con.buildSessionFactory();
		Session ses=sesfac.openSession();
	    //Employee e=new Employee("Anuj Chettiar", 21, "Male", "Product Development", 2012, 35700.0);   //Inserting values
		List<CustomerDetails> emp = ses.createQuery("SELECT h FROM CustomerDetails h", CustomerDetails.class).getResultList(); //Retrieve bulk datas
		//for (Employee hare : hares) { 
		    //System.out.println(hare); 
		
		
/*Map<String, Long> e =emp.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));   
System.out.println(e);*/				//count of genders

/*Map<String, Double> e =emp.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));   
System.out.println(e);*/				//avg of age

emp.stream().map(CustomerDetails::getAmount).distinct().forEach(System.out::println); //prints only amount
		
		/*Optional<Employee> highestPaidEmployeeWrapper=
				emp.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));  //max salary details
				         
				Employee highestPaidEmployee = highestPaidEmployeeWrapper.get();
				         
				System.out.println("Details Of Highest Paid Employee : ");
				         
				System.out.println("==================================");
				         
				System.out.println("ID : "+highestPaidEmployee.getId());
				         
				System.out.println("Name : "+highestPaidEmployee.getName());
				         
				System.out.println("Age : "+highestPaidEmployee.getAge());
				         
				System.out.println("Gender : "+highestPaidEmployee.getGender());
				         
				System.out.println("Department : "+highestPaidEmployee.getDepartment());
				         
				System.out.println("Year Of Joining : "+highestPaidEmployee.getYearofJoining());
				         
				System.out.println("Salary : "+highestPaidEmployee.getSalary());*/    
		
		
		/*emp.stream().filter(e -> e.getYearofJoining() > 2015).map(Employee::getName).forEach(System.out::println);*/  //prints joinees 2015
		
		/*Map<String, Long> employeeCountByDepartment=
				emp.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
				         
				Set<Entry<String, Long>> entrySet = employeeCountByDepartment.entrySet();
				         
				for (Entry<String, Long> entry : entrySet)
				{
				    System.out.println(entry.getKey()+" : "+entry.getValue());
				}*/                                                                     //Count of emp in each dept
		
		
		/*Map<String, Double> avgSalaryOfDepartments=
				emp.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
				         
				Set<Entry<String, Double>> entrySet = avgSalaryOfDepartments.entrySet();
				         
				for (Entry<String, Double> entry : entrySet) 						//prints the salary details
				{
				    System.out.println(entry.getKey()+" : "+entry.getValue());
				}*/
		
		
		/*Optional<Employee> seniorMostEmployeeWrapper=
				emp.stream().sorted(Comparator.comparingInt(Employee::getYearofJoining)).findFirst();
				         
				Employee seniorMostEmployee = seniorMostEmployeeWrapper.get();
				         
				System.out.println("Senior Most Employee Details :");
				         
				System.out.println("----------------------------");
				         
				System.out.println("ID : "+seniorMostEmployee.getId());				//Prints the highest salary details
				         
				System.out.println("Name : "+seniorMostEmployee.getName());
				         
				System.out.println("Age : "+seniorMostEmployee.getAge());
				         
				System.out.println("Gender : "+seniorMostEmployee.getGender());
				         
				System.out.println("Age : "+seniorMostEmployee.getDepartment());
				         
				System.out.println("Year Of Joinging : "+seniorMostEmployee.getYearofJoining());
				         
				System.out.println("Salary : "+seniorMostEmployee.getSalary());*/   

		
		
		/*Map<String, Long> countMaleFemaleEmployeesInSalesMarketing=
				emp.stream().filter(e -> e.getDepartment()=="HR")
				            .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
				 
				System.out.println(countMaleFemaleEmployeesInSalesMarketing);*/     //prints count of emp in dept
		
		
		
		
		/*Map<String, Double> avgSalaryOfMaleAndFemaleEmployees=
				emp.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
				         
				System.out.println(avgSalaryOfMaleAndFemaleEmployees);*/    //prints avg salary of emp
		
		
		
		/*Map<String, List<Employee>> employeeListByDepartment=
				emp.stream().collect(Collectors.groupingBy(Employee::getDepartment));
				         
				Set<Entry<String, List<Employee>>> entrySet = employeeListByDepartment.entrySet();
				         
				for (Entry<String, List<Employee>> entry : entrySet) 
				{
				    System.out.println("--------------------------------------");
				             
				    System.out.println("Employees In "+entry.getKey() + " : ");
				             
				    System.out.println("--------------------------------------");
				             
				    List<Employee> list = entry.getValue();    //prints list of emp in each dept
				             
				    for (Employee e : list) 
				    {
				        System.out.println(e.getName());
				    }
				}*/
		
		
		
		/*DoubleSummaryStatistics employeeSalaryStatistics=
				emp.stream().collect(Collectors.summarizingDouble(Employee::getSalary)); //prints avg and total salary of org
				         
				System.out.println("Average Salary = "+employeeSalaryStatistics.getAverage());
				         
				System.out.println("Total Salary = "+employeeSalaryStatistics.getSum());*/
		
		
		/*Map<Boolean, List<Employee>> partitionEmployeesByAge=
				emp.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25));
				         
				Set<Entry<Boolean, List<Employee>>> entrySet = partitionEmployeesByAge.entrySet();
				         
				for (Entry<Boolean, List<Employee>> entry : entrySet) 
				{
				    System.out.println("--------------------------------------------");
				             
				    if (entry.getKey()) 
				    {
				        System.out.println("Employees older than 25 years :"); 
				    }
				    else
				    {
				        System.out.println("Employees younger than or equal to 25 years :");
				    }
				             
				    System.out.println("--------------------------------------------");
				             
				    List<Employee> list = entry.getValue();
				             
				    for (Employee e : list) 
				    {
				        System.out.println(e.getName());
				    }												//prints below and above age 25
				}*/
		
		
		/*Optional<Employee> oldestEmployeeWrapper = emp.stream().max(Comparator.comparingInt(Employee::getAge));
        
		Employee oldestEmployee = oldestEmployeeWrapper.get();
		         
		System.out.println("Name : "+oldestEmployee.getName());
		         
		System.out.println("Age : "+oldestEmployee.getAge());      //prints oldest emp in org
		         
		System.out.println("Department : "+oldestEmployee.getDepartment());*/
		
		
		Transaction t=ses.beginTransaction();
		//ses.save(e);
		System.out.println("Successfully Updated");
		t.commit();
		ses.close();
		sesfac.close();
		return emp;
	}
	}
