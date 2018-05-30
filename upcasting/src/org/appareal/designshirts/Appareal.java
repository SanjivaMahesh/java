package org.appareal.designshirts;

import java.util.Scanner;

public class Appareal {
	
	Object sell() {
		Scanner s = new Scanner(System.in);
		System.out.println("design the shirt");
		String designAShirt = s.next();
		if (designAShirt.equalsIgnoreCase("Shirt")) {
			return new Shirt();
		} else if (designAShirt.equalsIgnoreCase("FormalShirt")) {
			return new FormalShirt();
		} else
			return null;
	}

}
