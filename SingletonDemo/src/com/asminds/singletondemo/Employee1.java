package com.asminds.singletondemo;

public class Employee1 {
	public static void main(String[] args) {
			Company com=Company.getInstance();
			com.id=78;
	}
}
