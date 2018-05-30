package com.mr.mobilemanf;

public class Tester {
	public static void main(String[] args) {
		Manufacture ma = new Manufacture();
		Mobile m=ma.giveMobile();
		Battery b=ma.giveBattery();
		b.charge();
	}

}
