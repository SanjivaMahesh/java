package com.birds;

import java.util.Scanner;

public class WildLifeSanctuary {

	Bird sell() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the bird name");
		String name = s.next();

		if (name.equalsIgnoreCase("parrot")) {
			return new Parrort();

		} else if (name.equalsIgnoreCase("swan")) {
			return new Swan();

		} else
			return null;

	}

	public static void main(String[] args) {
		WildLifeSanctuary w = new WildLifeSanctuary();
		Bird b = w.sell();

	}
}
