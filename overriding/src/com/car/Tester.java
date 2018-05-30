package com.car;

public class Tester {
	public static void main(String[] args) {
		ElectricCar e = new ElectricCar();
		Car c = e;
		c.start();
		PetrolCar p = new PetrolCar();
		Object o = c;

	}

}
