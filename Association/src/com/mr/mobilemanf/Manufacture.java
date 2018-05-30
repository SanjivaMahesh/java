package com.mr.mobilemanf;

public class Manufacture {
	Mobile giveMobile() {
		Mobile m = new Mobile();
		return m;

	}

	public Battery giveBattery() {
		return new Battery();

	}

}
