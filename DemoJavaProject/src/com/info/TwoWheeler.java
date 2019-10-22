package com.info;

abstract class TwoWheeler {
	public abstract void run();
}
class Honda extends TwoWheeler{

	@Override
	public void run() {
		System.out.println("Scooty is Running...");
		
	}
}
