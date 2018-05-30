package com.cast.upcastinh;

public class Lion extends Animal {
	String color = "brown";

	void eat() {
		System.out.println(this.color + " " + super.color);
		System.out.println("kill");
		System.out.println("and");
		super.eat();
	}

	public static void main(String[] args) {
		Lion l = new Lion();
		l.eat();

		Animal a = new Lion();
		a.eat();
	}

}
