package com.methodoverridingeg.vehicle;

public class Bike extends Vehicle {

	void start() {
		System.out.println("insert the key and press button");
	}

	public static void main(String[] args) {
		Bike b = new Bike();
		b.start();

		Truck t = new Truck();
		t.start();

		Car c = new Car();
		c.start(); 
	}

}
