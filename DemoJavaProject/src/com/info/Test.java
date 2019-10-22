package com.info;

public class Test {
	public void display() {
		System.out.println("One");
	}
	public static void main(String[] args) {
		Test a=new Test();
		a.display();
		Two b=new Two();
		b.display();
		System.out.println(b.add(4,2));
		System.out.println(b.add(5.,2.)); 
		//polymorphism
		EncapTest encap = new EncapTest();
		encap.setName("Maria's ");
		System.out.print("Name : " + encap.getName() );
		TwoWheeler test = new Honda();
		test.run();
	}
	String name;
	int id;
	int salary;

}
