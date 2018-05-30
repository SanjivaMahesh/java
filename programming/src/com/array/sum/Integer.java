package com.array.sum;

import java.util.Scanner;

public class Integer {
	public static void main(String[] args) {
		System.out.println("main method starts");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no.of values");
		int n = s.nextInt();
		int ar[] = new int[n];
		System.out.println("Enter " + n + "Integer values ");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = s.nextInt();
		}
		int count[] = new int[2];
		for (int i = 0; i < count.length; i++) {
			count[ar[i] % 2]++;
		}
		System.out.println("Number of even values " + count[0]);
		System.out.println("Number of odd values " + count[1]);

	}

}
