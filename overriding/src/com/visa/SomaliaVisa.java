package com.visa;

public class SomaliaVisa extends Visa {

	@Override
	void authorize() {
		System.out.println("Take money ang Give Visa");
	}

}
