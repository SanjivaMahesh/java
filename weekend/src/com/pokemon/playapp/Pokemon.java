package com.pokemon.playapp;

public class Pokemon {
	String color;
	static double height;
	public Pokemon(String color, double height) {
		this.color = color;
		this.height = height;
	}
	Pokemon(String color){
		this(color,height);
	}
	void talk() {
		System.out.println(this.color+" "+this.height);
	}

}
