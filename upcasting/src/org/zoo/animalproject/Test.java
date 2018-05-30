package org.zoo.animalproject;

public class Test {
	public static void main(String[] args) {
		Cat c = new Cat();
		System.out.println(c);

		Animal a = c;
		System.out.println(a);
		c.scratch();
		Object o = a;
	}

}
