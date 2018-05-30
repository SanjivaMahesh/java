package com.animals;

public class Elephant extends Animal {

	public Elephant() {
		super("black", "herbivorus", 500);
	}

	void cry() {
		System.out.println("cries");
	}

	@Override
	void eat() {
		System.out.println("veg");

	}

}
