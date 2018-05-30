package com.trai.week;

public class Tester {
	public static void main(String[] args) {
		AbstractSim a = new Airtel();
		AbstractSim j = new Jio();
		a.call();
		a.sms();
		j.call();
		j.sms();
	}
}
