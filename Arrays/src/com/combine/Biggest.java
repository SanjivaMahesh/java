package com.combine;

public class Biggest {
	int nthBiggest(int a[], int n) {
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[j] > a[i])
					count++;
			}
			if (count == n - 1)
				return a[i];
		}
		System.out.println("we not found" + n + "  th biggest");
		return 0;
	}

	public static void main(String[] args) {
		Biggest b = new Biggest();
		ArrayOperation ao = new ArrayOperation();
		int[] r = ao.readArr();
		int nthBiggest = b.nthBiggest(r, 5);
		System.out.println("biggest number is:" + nthBiggest);

	}
}
