package com.qspiders.calculatorapp;

public class Calculator {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.addition(150, 100);
		c.subtraction(20, 10);
		c.mul(2,3);

	}

	void addition(int num1, int num2) {
		int res = num1 + num2;
		System.out.println(res);
	}

	void mul(int i, int j) {
		 int res= i*j;
		 System.out.println(res);
		
	}

	 void subtraction(int num1, int num2) {
		int res = num1 - num2;
		System.out.println(res);
	}
	
}
