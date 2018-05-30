package com.visa;

public class AfghanistanVisa extends Visa {
	@Override
	void authorize() {
		System.out.println("check edu-records");
		System.out.println("check emp-records");
		System.out.println("no checking of criminal records");
		System.out.println("Take money and authorize");
	}
}
