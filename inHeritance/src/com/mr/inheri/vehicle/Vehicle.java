package com.mr.inheri.vehicle;

public class Vehicle {
	String color;
	int price;
	String brand;
	byte noOfWheels;

	void move() {
		System.out.println("vehicle is moving");

	}
 
	void start() {
		System.out.println("vehicle is started");
	}

	void stop() {
		System.out.println("vehicle is stopped");
	}
}
