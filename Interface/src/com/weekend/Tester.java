package com.weekend;

public class Tester {
	public static void main(String[] args) {
		Computer c = new Computer();
		Dell d = new Dell();
		Lenovo l = new Lenovo();
		c.operate(d);
		c.operate(l);
	}

}
