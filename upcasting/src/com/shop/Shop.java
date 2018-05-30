package com.shop;

import java.util.Scanner;

public class Shop {

	Fruit sell() {
		Scanner s = new Scanner(System.in);
		System.out.println("what fruit you want");
		String name = s.next();
		if (name.equalsIgnoreCase("Apple")) {
			Apple a = new Apple();
			return a;

		} else if (name.equalsIgnoreCase("mango")) {
			return new Mango();
		} else {
			return null;
		}

	}

}
