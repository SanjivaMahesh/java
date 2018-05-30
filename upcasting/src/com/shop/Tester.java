package com.shop;

public class Tester {
	public static void main(String[] args) {
		Shop s = new Shop();
		Fruit f = s.sell();
		System.out.println(f);
		if (f!=null) {
			System.out.println(f.color);
			f.prepareJuice();
			
		} else {
			System.out.println("there is no fruit to prepare juice");

		}
	}

}
