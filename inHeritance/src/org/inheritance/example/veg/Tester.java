package org.inheritance.example.veg;

public class Tester {
	public static void main(String[] args) {
		Capsicum c = new Capsicum();
		c.clean();
		System.out.println(c);

		Potato p = new Potato();
		p.clean();
		p.prepareChips();
		System.out.println(p.color + " " + p.type);

	}

}
