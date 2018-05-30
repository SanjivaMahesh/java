package com.method.octal;

import java.util.Scanner;

public class Octal {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the decimal number");
		int n = s.nextInt();
		String oct = decToOct(n);
		System.out.println("decimal equivalent" + oct);
		s.close();
	}

	static String decToOct(int n) {
		String oct = " ";
		do {
			int r = n % 8;
			oct = r + oct;
			n = n / 8;

		} while (n != 0);
		return oct;

	}

}
