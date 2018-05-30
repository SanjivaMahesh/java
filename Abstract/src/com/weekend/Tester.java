package com.weekend;

public class Tester {
	public static void main(String[] args) {
		AbstractMobile m = new Mobile();
		m.browseInternet();
		m.call();
		m.sms();
		if (m instanceof Mobile) {
			Mobile a = (Mobile) m;
			a.call();
		}

	}
}
