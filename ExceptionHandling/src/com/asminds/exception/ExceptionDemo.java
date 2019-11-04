package com.asminds.exception;

public class ExceptionDemo {
	public static void main(String[] args) {
			
		try {
			System.out.println("Hii Asminds!!!");
			int value=33/0;
			System.out.println("Sorry Error Occurs!!!");
		}
		catch (Exception e) {
			System.out.println(e);
		} 
		finally {
			System.out.println("Close Connection Code");
		}
	}
}
