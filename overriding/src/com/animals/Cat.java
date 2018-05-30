package com.animals;

public class Cat extends Animal {

	public Cat() {
		super("white", "omnivorous", 10);
	}

	void jump() {
		System.out.println("jumps");
	}

	@Override
	void eat() {

		System.out.println("any food");
	}
}
