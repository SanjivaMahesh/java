package com.rbi.currencyprinting.notes;

public class Starter {
	public static void main(String[] args) {
		Money m1 = new Money();
		Money m2 = new Money();
		Money m3 = new Money();
		m1.colour = "blue";
		m1.length = 10.5;
		m1.value = 50;
		m2.colour = "pink";
		m2.length = 15;
		m2.value = 2000;
		m3.colour = "green";
		m3.length = 12.5;
		m3.value = 100;
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m1.colour + " " + m1.length + " " + m1.value);
		System.out.println(m2.colour + " " + m2.length + " " + m2.value);
		System.out.println(m3.colour + " " + m3.length + " " + m3.value);
	}

}
