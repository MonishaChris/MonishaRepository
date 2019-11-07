package com.asminds.realtimeproject.ems;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue
	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearofJoining;
	double salary;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee( String name, int age, String gender, String department, int yearofJoining, double salary) {
		super();
	
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearofJoining = yearofJoining;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getYearofJoining() {
		return yearofJoining;
	}
	public void setYearofJoining(int yearofJoining) {
		this.yearofJoining = yearofJoining;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearofJoining=" + yearofJoining + ", salary=" + salary + "]";
	}
	

}
