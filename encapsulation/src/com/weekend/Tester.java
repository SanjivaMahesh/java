package com.weekend;

public class Tester {
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.setAccNo(122345689);
		b.setIfscCode("sbi12345");
		b.setName("mahesh");
		Address a = new Address();
		a.setCity("BAnglore");
		a.setDoorNo(8);
		a.setStreet("btm");
		a.setPinCode(500076);
		b.setAddress(a);
		System.out.println(b.getAccNo());
		System.out.println(b.getIfscCode());
		System.out.println(b.getName());
		Address result = b.getAddress();
		System.out.println(result.getDoorNo());
		System.out.println(result.getCity());
		System.out.println(result.getPinCode());
		System.out.println(result.getStreet());
	}

}
