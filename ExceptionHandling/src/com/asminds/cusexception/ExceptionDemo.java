package com.asminds.cusexception;

import java.util.Scanner;

public class ExceptionDemo  {
	public static void main(String[] args)throws InvalidatePinno {
		int Pinno=1234;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Pin no:");
		int NewPinno=sc.nextInt();
		
		if(Pinno==NewPinno) {
			System.out.println("Welcome");
		}
		else {
			throw new InvalidatePinno("Sorry, invalid pinn no");
		}
	
	}
}
