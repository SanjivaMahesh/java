package com.showrumupcastdowncast;

public class Person {
	void buy() {
		ShowRoom s = new ShowRoom();
		Object o = s.sell();
		if (o instanceof BenzCar) {
			BenzCar b = (BenzCar) o;
			b.drive();
		} else if (o instanceof Bike) {
			Bike b = (Bike) o;
			b.start();
		} else if (o instanceof Gold) {
			Gold g = (Gold) o;
			g.wear();
		} else
			System.out.println("product not available");
	}

	public static void main(String[] args) {

	}
}
