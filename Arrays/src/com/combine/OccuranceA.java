package com.combine;

public class OccuranceA {
	public static void main(String[] args) {
		ArrayOperation ao = new ArrayOperation();
		System.out.println("read the array elements");
		int ar[] = ao.readArr();
		int n = ar.length;
		for (int i = 0; i < n; i++) {
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (ar[i] == ar[j]) {
					count++;
					ar[j] = ar[n - 1];
					n--;
					j--;
				}
			}

			System.out.println(ar[i] + "--->" + count);
		}
	}

}
