package com.asminds.customexception;

import java.util.Scanner;

public class CustomExceptionDemo {
		public static void main(String[] args) throws InvalidPinno,ArithmeticException {
			int pinno=1234;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Pinno");
			int newPinno=s.nextInt();
			
			if(pinno==newPinno) {
				System.out.println("Valid Pinno");
			}
			else {
				throw new InvalidPinno("Invalid Pinno .. Please Check");
			}
		}
}
