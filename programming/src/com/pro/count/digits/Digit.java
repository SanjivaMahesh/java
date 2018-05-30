package com.pro.count.digits;

import java.util.Scanner;

public class Digit {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your number");
		s.close();
		int n = 45689;
		int count = 0;
		do {
			count++;
			n = n / 10;

		} while (n != 0);
		System.out.println(count + " digit is your number");

	}

}
