package com.vehicle.type;

public class Vehicle {
	String color;
	String brand;
	int noOfWheels;

	public Vehicle(String color, String brand, int noOfWheels) { // Alt+shift+s+o
		this.color = color;
		this.brand = brand;
		this.noOfWheels = noOfWheels;
	}

	void start() {
		System.out.println("Turn the key to Start");

	}

}
