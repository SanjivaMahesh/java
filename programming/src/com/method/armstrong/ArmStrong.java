package com.method.armstrong;

public class ArmStrong {
	public static void main(String[] args) {
		for (int i = 1; i <= 200; i++) {
			int x = isArmStrong(i);
			System.out.println((x == i) ? (i + " is ArmStrong") : (i + " is not ArmStrong"));
		}
	}

	static int pow(int m, int n) {
		int res = 1;
		for (int i = 0; i < n; i++) {
			res *= m;
		}
		return res;
	}

	static int isArmStrong(int n) {
		int result = 0;
		while (n > 0) {
			int bit = n % 10;
			result = result + pow(bit, 3);
			n = n / 10;
		}
		return result;
	}
}