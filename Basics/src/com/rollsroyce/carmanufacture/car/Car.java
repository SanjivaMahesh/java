 package com.rollsroyce.carmanufacture.car;

public class Car {
	String color;
	String model;
	String variant;
	String brand = "rollsroyce";

	Car(String color) {
		this.color = color;
		this.model = "ghost";
		this.variant = "petrol";
		this.show();
	}

	Car(String color, String model) {
		this.color = color;
		this.model = model;
		this.variant = "diesel";
		this.show();
	}

	Car(String color, String model, String variant) {
		this.color = color;
		this.model = model;
		this.variant = variant;
		this.show();
	}

	void show() {
		System.out.println(this.color + " " + this.model + " " + this.variant + " " + this.brand);
	}

	public static void main(String[] args) {
		Car c1 = new Car("white");

		Car c2 = new Car("red", "phantom");

		Car c3 = new Car("silver", "brezaa", "gas");

	}

}
