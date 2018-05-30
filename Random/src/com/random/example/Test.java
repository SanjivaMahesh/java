package com.random.example;

import java.util.Random;

public class Test {
	boolean generateRandom() {
		Random r = new Random();
		boolean b = r.nextBoolean();
		return b;// return newRandom().nextBoolean(); 

	}

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.generateRandom());
	}

}
