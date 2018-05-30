package com.benz;

public class Car {
	int price;

	public Car(int price) {
		super();
		this.price = price;
	}

	public String toString() {
		return "car price is " + this.price;
	}

	public static void main(String[] args) {
		Car c = new Car(2000000);
		System.out.println(c.getClass().getName() + "@" + Integer.toHexString(c.hashCode()));
		System.out.println(c);// car price is 2000000

		Car c2 = new Car(5000000);
		System.out.println(c2);// car price is 5000000

		System.out.println(Integer.toHexString(10));
	}

}
