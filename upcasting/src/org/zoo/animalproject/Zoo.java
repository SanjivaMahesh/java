package org.zoo.animalproject;

import java.util.Scanner;

public class Zoo {
	Animal sell() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter an animal name");
		String name = s.next();
		if (name.equalsIgnoreCase("cat")) {
			return new Cat();
		} else if (name.equalsIgnoreCase("Cow")) {
			return new Cow();
		} else if (name.equalsIgnoreCase("lion")) {
			return new Lion();
		} else
			return null;
	}
}
