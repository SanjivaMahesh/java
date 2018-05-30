package com.airtel.simservice;

import com.trai.simplan.AbstractSim;

public class AirtelSim extends AbstractSim {

	public void call() {
		System.out.println(" 2G CALL");
	}

	@Override
	public void sms() {
		System.out.println("SMS");

	}

	@Override
	public void sos() {
		System.out.println("EMERGENCY");

	}

	public static void main(String[] args) {
		AbstractSim a = new AirtelSim();
		a.call();
		a.sms();
		a.sos();

	}

}
