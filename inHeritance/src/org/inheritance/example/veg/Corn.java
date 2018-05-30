package org.inheritance.example.veg;

public class Corn extends Vegetable {

	public Corn() {
		super("yellow", "sweet");

	}

	void prepareSoup() {
		System.out.println("make a soup");

	}

	void clean() {
		System.out.println("peel it off");
	}
}
