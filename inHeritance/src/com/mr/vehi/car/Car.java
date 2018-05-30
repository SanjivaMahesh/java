package com.mr.vehi.car;

public class Car extends Vehicle {
	boolean isAcPresent;

	void temperatureControl() {
		System.out.println("temp is controlling");
	}

	Car() {
		super("silver", 10000000);

	}

	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.color);
	}

}
