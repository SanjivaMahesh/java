package com.vehicle.type;

public class Bike extends Vehicle {
	public Bike() {
		super("Blue", "TVS", 2);
	}

	@Override
	void start() {
		System.out.println("kick to start");
	}

}
