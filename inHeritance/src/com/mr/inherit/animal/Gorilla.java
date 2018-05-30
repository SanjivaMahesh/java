package com.mr.inherit.animal;

public class Gorilla {
	void eat() {
		System.out.println("take food and eat");
	}

	public static void main(String[] args) {
		Lion l = new Lion();
		System.out.println(l);
		Gorilla g = new Gorilla();
		g.eat();

	}

}
