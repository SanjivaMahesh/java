package com.mr.ass.student;

public class Tester {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "MAHESH";
		s.age = 24;
		s.gender = "MALE";
		s.address = new Address();
		s.address.doorNo = 5;
		s.address.street = "BTM";
		s.address.city = "BANGLORE";
		s.address.pincode = 500076;
		System.out.println(s);

	}

}
