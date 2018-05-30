package org.inheritance.example.veg;

public class Vegetable {
	String color;
	String type;

	void clean() {
		System.out.println("cut,scrape and clean with water");
	}

	public Vegetable(String color, String type) {
		this.color = color;
		this.type = type;
	}

}
