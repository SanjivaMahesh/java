package com.pro.product;

import java.util.Scanner;

public class Product {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter your number");
		int n = s.nextInt();
		s.close();
		int pro = 1, i = 1;

		do {
			pro = pro * i;
			i++;

		} while (i <= n);
		System.out.println(" product of first " + n + "number is" + pro);
	}
  
}
