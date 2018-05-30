package com.shop.fruit.eg;

public class Tester {
	void eat() {
		Shop s = new Shop("reliance fresh");
		Fruit f = s.sell();
		System.out.println(f.color + " " + f.price);
		if (f instanceof Apple) {
			Apple a = (Apple) f;
			a.prepareSalad();
		} else if (f instanceof Mango) {
			Mango m = (Mango) f;
			m.preparePickle();

		} else if (f instanceof Lemon) {
			Lemon l = (Lemon) f;
			l.prepareJuice();
		}

	}

	public static void main(String[] args) {
		Tester t = new Tester();
		t.eat();
	}

}
