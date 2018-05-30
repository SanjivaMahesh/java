package com.animals;

public class Animal {
	String colour;
	String type;
	double weight;

	public Animal(String colour, String type, double weight) {
		this.colour = colour;
		this.type = type;
		this.weight = weight;
	}

	void eat() {
		System.out.println("ATE");
	}

	void sleep() {
		System.out.println("SLEEP");
	}
}
