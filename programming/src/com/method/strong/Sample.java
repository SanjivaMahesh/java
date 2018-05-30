package com.method.strong;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String option = null;
		do {
			System.out.println("Enter your name");
			String name = s.nextLine();
			System.out.println(name);
			System.out.println("Do you want to enter more names");
			option = s.next();
			s.nextLine();
		} while (option.equalsIgnoreCase("Y"));
		s.close();
	}
}