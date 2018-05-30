package com.all.stars;

public class NumbersA {
	public static void main(String[] args) {
		int n = 7, sp = n / 2, st = 1;
		for (int i = 1; i <= n; i++) {
			System.out.print(" ");

			int k = st / 2 + 1;
			for (int j = 1; j <= st; j++) {
				System.out.print(k + " ");
				if (j <= st / 2)
					k--;

				else
					k++;
				if (i <= n / 2) {
					sp--;
					st = st + 2;

				} else {
					sp++;
					st = st - 2;
				}
			
			}

		}
	}
}
