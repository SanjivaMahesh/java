package com.method.hexa;

import java.util.Scanner;

public class HexaDecimal {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter decimal value");
		int n = s.nextInt();
		String hex = decToHex(n);
		System.out.println("Hexa decimal number is " + hex);
		s.close();

	}

	static String decToHex(int n) {
		String hex = " ";
		do {
			int r = n % 16;
			if (r < 10) {
				hex = r + hex;
			} else
				hex = (char) (r + 55) + hex;
			n = n / 16;

		} while (n != 0);
		return hex;
	}

}
