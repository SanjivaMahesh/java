package com.mr.abstarct.IMC;

public class SamsungMobile extends AbstractIMC {

	void bluetooth() {
		System.out.println("bluetooth");
	}

	@Override
	void call() {
		System.out.println("call");

	}

	@Override
	void sms() {
		System.out.println("sms");

	}

}
