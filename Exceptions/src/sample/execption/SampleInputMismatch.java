package sample.execption;

import java.util.Scanner;

public class SampleInputMismatch {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter your age");
		int age = 0;
		try {
			age = s.nextInt();

		} catch (Exception e) {
			System.out.println("Enter an invalid age");
		}
		s.close();
		System.out.println(age);
		System.out.println("succesfully completed");

	}

}
