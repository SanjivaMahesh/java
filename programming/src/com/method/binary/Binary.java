package com.method.binary;

import java.util.Scanner;

public class Binary {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter binary equivalent number");
		int n = s.nextInt();
		String bin = decToBin(n);
		System.out.println("binary equivalent is" + bin);
		s.close();
	}

	static String decToBin(int n) {
		{
			String bin = " ";
			do {
				int r = n % 2;
				bin = r + bin;
				n = n / 2;

			} while (n != 0);
			return bin;
		}	}

}
