package com.asminds.immutable;

final public class Emp1 {// class cannot be inherited
	private final int id ; // variables cannot reinitialized

	public Emp1(int id) {
	super();
	this.id = id;
}

	public int getid() { // only getter is used
		return id;

	}
}
