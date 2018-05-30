package com.pokemon.playapp;

public class Person {
	String name = "ASH";

	void play() {
		PokeBall pb = new PokeBall();
		Pokemon p = pb.givePokemon();
		if (p instanceof Pichachu) {
			Pichachu pi = (Pichachu) p;
			pi.giveShock();
		} else if (p instanceof Charmander) {
			Charmander c = (Charmander) p;
			c.fire();
		} else if (p instanceof Bulbazar) {
			Bulbazar b = (Bulbazar) p;
			b.shootBlades();

		} else
			System.out.println("no pokemon at this time");

	}

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.play();
		System.out.println("completed");
	}
}
