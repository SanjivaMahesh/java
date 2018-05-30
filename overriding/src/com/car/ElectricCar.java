package com.car;

public class ElectricCar extends Car {

	void charge() {
		System.out.println("electric current used to move");
	}

	@Override
	void start() {
		System.out.println("Speak as Start");
	}

}
