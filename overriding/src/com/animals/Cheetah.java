package com.animals;

public class Cheetah extends Animal {
	public Cheetah() {
		super("yellow", "carnivorous", 25);
	}

	void run() {
		System.out.println("runs");

	}

	@Override
	void eat() {
		System.out.println("non veg");

	}
}
