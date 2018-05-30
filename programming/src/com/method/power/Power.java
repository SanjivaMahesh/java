package com.method.power;

import java.util.Scanner;

public class Power {
	static void checkArm(int n) {
		int temp = n;
		int result = 0;
		while (n > 0) {
			int bit = n % 10;
			result += pow(bit, 3);
			n /= 10;
		}
		System.out.println(temp == result ? "armstrong" : "not armstrong");
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter m and n to find the power");
		int pow = pow(s.nextInt(), s.nextInt());
		System.out.println(pow);
		s.close();

		checkArm(153);
	}

	static int pow(int m, int n) {
		int res = 1;
		for (int i = 0; i < n; i++) {
			res = res * m;
		}
		return res;
	}
}
