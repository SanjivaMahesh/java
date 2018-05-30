package org.student.constructor;

public class Student {
	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println(this.id + " " + this.name);
	}

	Student() { 
		this.id = 100;
		this.name = "kiran";
		System.out.println(this.id + " " + this.name);
	}

	public static void main(String[] args) {
		Student s = new Student(38, "mahesh");
		Student s1 = new Student(40, "charan");
		Student s2 = new Student();
	}

}
