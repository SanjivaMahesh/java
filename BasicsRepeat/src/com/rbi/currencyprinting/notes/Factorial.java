package com.rbi.currencyprinting.notes;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = s.nextInt();
		int sum = 1;
		for (int i = n; i >= 2; i--) {
			sum = sum * i;
		}
		System.out.println("The factorial of " + n + " is " + sum);
	}
}
