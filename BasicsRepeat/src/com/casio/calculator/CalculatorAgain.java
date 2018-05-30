package com.casio.calculator;

public class CalculatorAgain {
	void show(int a, int b, int c) {
		System.out.println("addition of numbers is " + (a + b + c));
		System.out.println("multiplication of number is " + (a * b * c));
	}

	void show(double a, double b, double c) {
		System.out.println("addition of numbers is " + (a + b + c));
		System.out.println("division of numbers is " + (a / b / c));
	}

	public static void main(String[] args) {
		CalculatorAgain c = new CalculatorAgain();
		c.show(10, 20, 30);
		c.show(1205, 1000, 1000);

		c.show(12.5, 10.25, 1000.579);
		c.show(4, 4.5, 8.2);
		System.out.println(c);

	}

}
