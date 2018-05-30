package org.inheritance.example.veg;

public class Capsicum extends Vegetable {

	public Capsicum() {
		super("green", "spicy");

	}

	void preparePizza() {
		System.out.println("used in pizza");
	}

	void clean() {
		System.out.println("dip in water");
	}
}
