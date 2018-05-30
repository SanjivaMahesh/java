package com.fish;

import java.util.Scanner;

public class Ocean {
	SeaCreatures give() {
		System.out.println("what creature you want");
		Scanner s = new Scanner(System.in);
		String name = s.next();
		if (name.equalsIgnoreCase("fish")) {
			return new Whale();
		} else if (name.equalsIgnoreCase("crab")) {
			return new Crab();
		} else if (name.equalsIgnoreCase("tortoise")) {
			return new Tortoise();
		} else
			return null;
	}

	public static void main(String[] args) {

	}
}
