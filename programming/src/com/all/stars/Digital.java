package com.all.stars;

import java.util.Scanner;

public class Digital {
	public static void main(String[] args) {
		System.out.println("Enter the value of n");
		int n = new Scanner(System.in).nextInt();
		int sp = n - 1;
		boolean bit = true;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < sp; j++) {
				System.out.print("   ");
			}
			for (int j = 0; j < (n - sp); j++) {

				if (bit) {
					System.out.print(" " + 1 + " ");
				} else {
					System.out.print(" " + 0 + " ");
				}
				bit = !(bit);
			}
			System.out.println();
			sp--;
			bit = true;
		}

	}

}