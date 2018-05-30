package com.combine;

import java.util.Scanner;

public class ConvertNumberToWords {
	String[] one = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
			"twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
	String[] two = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

	void numToWord(int n, String st) {
		if (n < 20) {
			System.out.print(one[n] + " ");
		} else
			System.out.print(two[n / 10] + " " + one[n % 10] + " ");
		if (n != 0) {
			System.out.print(st + " ");
		}
	}

	public static void main(String[] args) {
		ConvertNumberToWords c = new ConvertNumberToWords();
		System.out.println("Enter your number");
		int num = new Scanner(System.in).nextInt();
		c.numToWord(num / 10000000, "Crore");
		c.numToWord(num / 100000 % 100, "lakh");
		c.numToWord(num / 1000 % 100, "thousand");
		c.numToWord(num / 100 % 10, "hundred");
		c.numToWord(num % 100, "");
	}
}
