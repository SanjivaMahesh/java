package org.inheritance.example.veg;

public class Potato extends Vegetable {

	public Potato() {
		super("brown", "salty");

	}

	void prepareChips() {
		System.out.println("make chips");
	}

	void clean() {
		System.out.println("scrape it and clean with water");
	}

}
