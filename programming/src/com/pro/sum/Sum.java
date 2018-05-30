package com.pro.sum;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		s.close();
		int n = 12;
		int sum = 0;
		int i = 1;
		while (i <= n) {
			sum = sum + i;
			i++;

		}
		System.out.println("sum of first" + n + "natural numbetr sum is" + sum);

	}

}
