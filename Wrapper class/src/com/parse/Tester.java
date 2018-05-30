package com.parse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tester {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");
		String name = br.readLine();
		System.out.println("Enter your age");
		int age = Integer.parseInt(br.readLine());
		System.out.println("Enter youn phoneNo");
		long phNo = Long.parseLong(br.readLine());
		System.out.println("Enter your Salary");
		double sal = Double.parseDouble(br.readLine());
		System.out.println("Are you working");
		boolean emp = Boolean.parseBoolean(br.readLine());
		System.out.println("Enter your height");
		float ht = Float.parseFloat(br.readLine());
		System.out.println("Enter your experience");
		byte b = Byte.parseByte(br.readLine());
		System.out.println("your name is " + name);
		System.out.println("your age is " + age);
		System.out.println("your phoneNo is " + phNo);
		System.out.println("your Salary is " + sal);
		System.out.println(" R u working " + emp);
		System.out.println("your height is " + ht);
		System.out.println("your experience is " + b);
	}

}
