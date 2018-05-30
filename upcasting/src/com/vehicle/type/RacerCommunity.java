package com.vehicle.type;

import java.util.Scanner;

public class RacerCommunity {

	public Vehicle sponcer() {
		System.out.println("what vehicle you want?");
		@SuppressWarnings("resource")
		String name = new Scanner(System.in).next();
		if (name.equalsIgnoreCase("car")) {
			return new Car();
		} else if (name.equalsIgnoreCase("bike")) {
			return new Bike();

		} else if (name.equalsIgnoreCase("truck")) {
			return new Truck();
		} else {

			return null;
		}

	}
}
