package com.combine;

import java.util.Scanner;

public class ArrayOperation {
	int[] readArr() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many integers you have: ");
		int n = s.nextInt();
		int ar[] = new int[n];
		System.out.println("Enter  " + n + " integer values");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = s.nextInt();
		}
		return ar;
	}

	void dispArr(int[] ar) {
		for (int i = 0; i < ar.length; i++) {

		}
	}
}
