package com.basic;

import java.util.Scanner;

public class AcceptArray {
	int[] readArr() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an array");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Display elements are" + n);
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		return a;
	}

	void dispArr(int[] a) {
		for (int i = 0; i < a.length; i++) {

		}
	}

}
