package com.weekend;

public class Mobile extends AbstractMobile {

	@Override
	void sms() {
		System.out.println("sms");
	}

	@Override
	void browseInternet() {
		System.out.println("browse internet");
	}

}
