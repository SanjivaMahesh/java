package com.citi.creditexample;

public class Tester {
	public static void main(String[] args) {
		CreditCard c = new CreditCard();
		c.setCardNo(123456789l);
		c.setNameOnCard("MAHESH");
		c.setCvv(123);
		System.out.println(c);
		System.out.println(c.getClass().getName());
		System.out.println(c.getCardNo());
		System.out.println(c.getCvv());
		System.out.println(c.getNameOnCard());
	}
}
