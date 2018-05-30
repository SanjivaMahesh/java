package com.method.perfect;

import java.util.Scanner;

public class Perfect {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the perfect number");
		int n = s.nextInt();
		boolean result = isPerfect(n);
		if (result) {
			System.out.println(result + " is perfect number");
		} else
			System.out.println(result + " is not a perfect number");
		s.close();
	}

	private static boolean isPerfect(int n) {
		int sum = 0;
		int i = 1;
		while (i <= n / 2) {
			if (n % i == 0)
				sum = sum + i;
			i++;

		}
		return sum == n;
	}

}
