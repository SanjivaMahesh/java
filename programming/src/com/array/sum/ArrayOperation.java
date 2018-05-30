package com.array.sum;

import java.util.Scanner;

public class ArrayOperation {
	int[] readArr() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many integers you have: ");
		int n = s.nextInt();
		int ar[] = new int[n];
		System.out.println("Enter " + n + " integer value");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = s.nextInt();
		}
		return ar;
	}

	void dispArr(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i] + " ");
		}
		System.out.println();
	}

	int sumOfArray(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		ArrayOperation ao = new ArrayOperation();
		System.out.println("read array element");
		int ele[] = ao.readArr();
		System.out.println("Entered array element: ");
		ao.dispArr(ele);
		System.out.println("sum of all elements: " + ao.sumOfArray(ele));
	}

}
