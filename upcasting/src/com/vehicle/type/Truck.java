package com.vehicle.type;

public class Truck extends Vehicle {

	public Truck() {
		super("brown", "TATA", 8);
	}

	void activateTurbo() {
		System.out.println("Turbo activated");
	}

}
