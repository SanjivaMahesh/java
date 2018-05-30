package com.encap.student;

public class Tester {
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(20);
		s.setName("mahesh");
		s.setAddress("btm");
		s.setAge(25);
		s.setPhoneNo(9182640862L);
		System.out.println(s);
		System.out.println(s.getAddress());
		System.out.println(s.getAge());
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getPhoneNo());

	}

}
