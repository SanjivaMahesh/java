package org.pract.mine;

public class Mobile {
	String brand = "redmi";
	String model;
	String color;

	Mobile(String model, String color) {
		this.model = model;
		this.color = color;
		display();
	}

	void display() {
		System.out.println(this.brand + " " + this.color + " " + this.model);

	}

	public static void main(String[] args) {
		Mobile m1 = new Mobile("Note 5", "BLACK");
		Mobile m2 = new Mobile("4A", "WHITE");
	}

}
