package com.reliance.simservice;

import com.trai.simplan.AbstractSim;

public class JioSim extends AbstractSim {

	@Override
	public void call() {
		System.out.println("4G CALL");
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
		AbstractSim j = new JioSim();
		j.call();
		j.sms();
		j.sos();
	}

}
