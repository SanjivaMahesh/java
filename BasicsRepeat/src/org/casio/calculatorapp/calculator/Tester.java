package org.casio.calculatorapp.calculator;

public class Tester {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		int res = c.add(150, 350);
		System.out.println(c);
		System.out.println(res);

		int o = c.mul(15, 8);
		System.out.println(o);

		int s = c.sub(2500, 20);
		System.out.println(s);

		float d = c.div(1, 4);
		System.out.println(d);

		int h = c.square(15);
		System.out.println(h);

		int f = c.cube(15);
		System.out.println(f);
	}

}
