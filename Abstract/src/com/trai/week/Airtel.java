package com.trai.week;

public class Airtel extends AbstractSim {

	@Override
	void call() {
		System.out.println("2G call");
	}

	@Override
	void sms() {
		System.out.println("analog sms");
	}

}
