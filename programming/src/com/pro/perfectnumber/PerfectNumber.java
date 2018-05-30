package com.pro.perfectnumber;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your number");
		int n = s.nextInt();
		int temp = n;
		int sum = 0, i = 1;
		while (i <= n / 2) {
			if (n % i == 0) {
				sum = sum + i;

			}
			i++;

		}
		if (sum == temp)
			System.out.println(n + "is perfect number");
		else
			System.out.println(n + "is not a perfect number");

	}
}
