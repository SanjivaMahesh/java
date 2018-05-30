package org.mine.activities;

public class Student {
	public static void main(String[] args) {
		Student s=new Student();
		s.dance();
		s.sings();
		s.writes();
		s.study();
	}
	
	void dance() {
		System.out.println("he can dance");
	}
	
	void sings() {
		System.out.println("he can sing");
	}
	
	void study() {
		System.out.println("he can study");
	}
	
	void writes() {
		System.out.println("he can writes");
	}

}
