package com.rbi.currencyprinting.notes;

import java.util.Scanner;

public class RecurviseFactorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a n value");
		int n = s.nextInt();
		int res = fact(n);
		System.out.println("The factorial of " + n + " is " + res);
	}

	private static int fact(int n) {
		int res = 1;
		while (n > 1) {
			res = n * fact(n - 1);
		}
		return res;
	}

}