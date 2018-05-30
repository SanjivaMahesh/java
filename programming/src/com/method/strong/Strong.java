package com.method.strong;

import java.util.Scanner;

public class Strong {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		System.out.println("Enter a number");
		boolean r = isStrong(new Scanner(System.in).nextInt());
		if (r) {
			System.out.println("strong number");
		} else {
			System.out.println("not a strong number");
		}
	}

	private static boolean isStrong(int n) {
		int sum = 0, temp = n;
		while (n != 0) {
			int r = n % 10;
			sum = sum + fact(r);
			n = n / 10;
		}
		return sum == temp;
	}

	private static int fact(int n) {
		int f = 1;
		while (n > 0) {
			f = f * n;
			n--;
		}
		return f;
	}

}