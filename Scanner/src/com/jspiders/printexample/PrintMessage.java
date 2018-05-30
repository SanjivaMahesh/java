package com.jspiders.printexample;

import java.util.Scanner;

public class PrintMessage {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter your age");
		int age = s.nextInt();
		s.nextLine();
		System.out.println("enter your name");
		String name = s.nextLine();
		System.out.println("Age is " + age + " Name is " + name);
	}

}
