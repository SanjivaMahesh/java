package com.mr.inherit.phone;

public class Tester {
	public static void main(String[] args) {
		Tester t = new Tester();
		Samsung s = new Samsung();
		s.price = 12000;
		s.color = "black";
		s.brand = "Samsung";
		s.call();
		s.sms();
		s.SamsungPay();
		System.out.println(s);
		System.out.println(s.price + " " + s.brand + " " + s.color);

		Nokia n = new Nokia();
		n.price = 15000;
		n.color = "grey";
		n.brand = "Nokia";
		n.NokiaPay();
		System.out.println(n);
		System.out.println(n.price + " " + n.brand + " " + n.color);

		MI m = new MI();
		m.price = 20000;
		m.color = "white";
		m.brand = "MI";
		m.MIPay();
		System.out.println(m);
		System.out.println(m.price + " " + m.brand + " " + m.color);

	}

}
