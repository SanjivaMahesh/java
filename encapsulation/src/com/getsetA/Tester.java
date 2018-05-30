package com.getsetA;

public class Tester {
	public static void main(String[] args) {
		Aadhar a = new Aadhar();
		a.setAadharNo(564532046888l);
		a.setAddress("btm");
		a.setName("Mahesh");
		a.setEmail("mahesh@gmail.com");
		a.setPhoneNo(9182640862l);
		System.out.println(a.getAadharNo());
		System.out.println(a.getAddress());
		System.out.println(a.getEmail());
		System.out.println(a.getName());
		System.out.println(a.getPhoneNo());
	}

}
