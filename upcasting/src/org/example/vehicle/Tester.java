package org.example.vehicle;

public class Tester {
	public static void main(String[] args) {
		Bike b = new Bike();
		b.start();
		System.out.println(b);

		Truck t = new Truck();
		t.start();
		System.out.println(t);

		Car c = new Car();
		c.start();
		System.out.println(c);

	}

}
