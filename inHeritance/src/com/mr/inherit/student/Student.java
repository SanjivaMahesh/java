package com.mr.inherit.student;

public class Student {
	int id;
	String name;



	Student(int id, String name) {
		this.id=id;
		this.name=name;

	}

	public static void main(String[] args) {
		Student s = new Student(1,"alpha");
	}
}
