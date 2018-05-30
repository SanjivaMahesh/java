package com.showrumupcastdowncast;

import java.util.Scanner;

public class ShowRoom {
	Object sell() {
		Scanner s = new Scanner(System.in);
		System.out.println("what obj u want? benzcar,gold,bike");
		String nameOfObject = s.next();
		switch (nameOfObject) {
		case "BenzCar":
		case "benzcar":
			return new BenzCar();
		case "Gold":
		case "gold":
			return new Gold();
		case "BIKE":
		case "bike":
			return new Bike();

		default:
			return null;
		}
	}

}
