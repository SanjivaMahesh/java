package com.mr.student;

public class Boy extends Student {
	Boy(String name, int age, String gender) {
		super(name, age, gender);

	}

	Boy() {
		this("mahesh", 24, "male");
	}

	void show() {
		System.out.println(this.name + " " + this.age + " " + this.gender);
	}

	public static void main(String[] args) {
		Boy b = new Boy();
		b.show();

		Boy b1 = new Boy("MR", 25, "male");
		b1.show();
	}
}
