package com.getset;

public class Tester {
	public static void main(String[] args) {
		Customer c = new Customer();
		c.setCustId(12356);
		c.setName("Mahesh");
		c.setPhoneNo(9182640862l);
		System.out.println(c.getCustId());
		System.out.println(c.getName());
		System.out.println(c.getPhoneNo());

	}

}
