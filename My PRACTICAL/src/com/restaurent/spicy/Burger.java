package com.restaurent.spicy;

public class Burger {
	String name = "MC Donalds";
	int price;
	String type;
	boolean isCheesy;

	Burger(String type) {
		this.type = type;
		this.isCheesy = true;
		this.price = 150;
		this.show();
	}

	void show() {
		System.out.println(this.type + " " + this.price + " " + this.isCheesy);
	}

	Burger(int price, boolean isCheesy) {
		this.type = "veg";
		this.price = price;
		this.isCheesy = isCheesy;
		this.show();
	}

	Burger(String type, boolean isCheesy) {
		this.price = 500;
		this.type = type;
		this.isCheesy = isCheesy;
		this.show();
	}

	Burger(String type, int price, boolean isCheesy) {
		this.isCheesy = isCheesy;
		this.type = type;
		this.price = price;
		this.show();
	}

	public static void main(String[] args) {
		Burger b = new Burger("Non veg", 200, true);
		Burger b1 = new Burger("veg");
		Burger b2 = new Burger(175, true);
		Burger b3 = new Burger("Non veg", false);
	}
}
