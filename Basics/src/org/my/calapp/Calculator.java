package org.my.calapp;

public class Calculator {
	int add(int a, int b) {
		int c = a + b;
		System.out.println(c);
		return c;
	}

	int add(int a, int b, int c) {
		int d = a + b + c;
		System.out.println(d);
		return d;
	}

	double add(double a, double b) {
		double e = a + b;
		System.out.println(e);
		return e;
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(4, 5);
		c.add(45.6, 72.4);
		c.add(1, 2, 3);
	}
}
