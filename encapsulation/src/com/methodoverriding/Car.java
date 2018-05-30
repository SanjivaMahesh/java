package com.methodoverriding;

public class Car {
	public String toString() {
		return "car objects";
	}

	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.getClass().getName() + "@" + Integer.toHexString(c.hashCode()));
	} 

}
