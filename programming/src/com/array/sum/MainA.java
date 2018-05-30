package com.array.sum;

import java.util.Scanner;

public class MainA {
	public static void main(String[] args) {
		System.out.println("main method starts");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no.of values");
		int n = s.nextInt();
		double ele[] = new double[7];
		System.out.println("Enter " + n + " values");
		s.close();
		for (int i = 0; i < n; i++) {
			ele[i] = s.nextDouble();
		}
		double sum = 0;
		for (int i = 0; i < ele.length; i++) {
			sum += ele[i];
		}
		System.out.println("TOTAL is: " + sum);
		System.out.println("AVG is: " + sum / ele.length);
	}

}