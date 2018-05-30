package com.combine;

public class Occurance {
	public static void main(String[] args) {
		ArrayOperation ao = new ArrayOperation();
		System.out.println("read the array elements");
		int ar[] = ao.readArr();
		for (int i = 0; i < ar.length; i++) {
			int count = 1;
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] == ar[j])
					count++;
			}
			System.out.println(ar[i] + "--->" + count);

		}
	}

}
