package com.shop.fruit.eg;

public class Fruit {
	String color;
	int price;

	Fruit(String color, int price) {
		this.color = color;
		this.price = price;
	}

	void prepareJuice(String color, int price) {
		System.out.println("fruits are used to prepare juice");
	}

}
