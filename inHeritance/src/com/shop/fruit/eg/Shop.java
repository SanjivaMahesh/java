package com.shop.fruit.eg;

import java.util.Scanner;

public class Shop {
	String name;

	public Shop(String name) {
		this.name = name;
	}

	public Fruit sell() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Input");
		int n = s.nextInt();
		s.close();
		switch (n) {
		case 1:
			return new Lemon();
		case 2:
			return new Apple();
		case 3:
			return new Mango();

		default:
			return null;
		}

	}

}
