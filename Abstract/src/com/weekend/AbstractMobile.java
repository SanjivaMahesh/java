package com.weekend;

abstract public class AbstractMobile {
	void call() {
		System.out.println("call");
	}
	abstract void sms();
	abstract void browseInternet();
}
