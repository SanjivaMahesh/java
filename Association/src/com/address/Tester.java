package com.address;

public class Tester {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p);
		System.out.println(p.a);
		p.a = new Address();
		System.out.println(p.a);
		System.out.println(p.a.doorNo);
		p.a.doorNo = 24;

	}

}
