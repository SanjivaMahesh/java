package org.zoo.animalproject;

public class Animal {
	String color;
	String type;

	void eat() {
		System.out.println("ate");
	}

	void sleep() {
		System.out.println("sleep");
	}

	Animal(String color, String type) {
		this.color = color;
		this.type = type;

	}

}
