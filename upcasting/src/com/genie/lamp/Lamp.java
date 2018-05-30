package com.genie.lamp;

import java.util.Random;

public class Lamp {
	Object heatUp() {
		Random r = new Random();
		int n = r.nextInt(5) + 1;
		switch (n) {
		case 1:
			return new Genie();
		case 2:
			return new Mini();
		default:
			return null;
		}

	}
	public static void main(String[] args) {
		Lamp l = new Lamp();
		Object o=l.heatUp();
		System.out.println(o);
	}

}
