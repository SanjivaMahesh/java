package com.instance.example;

public class Tester {
	void taste() {
		System.out.println(" he wants to taste it");
	}

	public static void main(String[] args) {
		Tester t = new Tester();
		Fruit f = new Fruit();
		f.clean();
		if (f instanceof Apple) {
			Apple a = (Apple) f;
			a.prepareSalad();
		}
		if (f instanceof Watermelon) {
			Watermelon w = (Watermelon) f;
			w.prepareJuice();
		}
		if (f instanceof Strawberry) {
			Strawberry s = (Strawberry) f;
			s.prepareMilkShake();
			t.taste();
		}
	}
}
