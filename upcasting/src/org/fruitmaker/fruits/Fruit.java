package org.fruitmaker.fruits;

public class Fruit {
	String color;
	String price;

	void clean() {
		System.out.println("slice and clean");
	}

	void prepareJuice() {
		this.clean();
		System.out.println("add to mixer and crush");
	}

}
