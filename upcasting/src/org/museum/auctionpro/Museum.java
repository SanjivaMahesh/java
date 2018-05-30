package org.museum.auctionpro;

import java.util.Scanner;

public class Museum {
	Object auction() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the thing");
		String name=s.next();
		if(name.equalsIgnoreCase("Car")) {
			return new Car();
		}
		else if(name.equalsIgnoreCase("coin")) {
			return new Coin();
			
		}
		else if(name.equalsIgnoreCase("Sword")) {
			return new Sword();
		}
		else
			return null;
	}

}
