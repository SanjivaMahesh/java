package com.pro.three.digit;

import java.util.Scanner;

public class ThreeNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter 3 digit number");
		int n = s.nextInt();
		s.close();
		if (n > 99 && n < 1000 || n < -99 && n < -1000) {
			System.out.println(n + " is 3 digit number ");
		} else
			System.out.println(n + " is not a 3 digit number ");

	}
}