package org.mr.task.manufacture.car;

public class Car {

	Smoke fill(Petrol p) {
		System.out.println("fuel is petrol");
		Smoke s = new Smoke();
		System.out.println("car fill with petrol");
		return s;

	}

	Smoke fill(Diesel d) {
		System.out.println("fuel is diesel");
		Smoke s = new Smoke();
		System.out.println("car fill with diesel");
		return s;
	}

	Smoke fill(Gasoline g) {
		System.out.println("fuel is gas");
		Smoke s = new Smoke();
		System.out.println("car is fill with gas");
		return s;
	}

	public static void main(String[] args) {
		Car c = new Car();
		Petrol p = new Petrol();
		Diesel d = new Diesel();
		Gasoline g = new Gasoline();
		c.fill(d);
		c.fill(g);
		c.fill(p);
		System.out.println("smoke is coming while moving");
	}

}
