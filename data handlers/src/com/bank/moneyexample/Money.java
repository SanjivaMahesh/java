package com.bank.moneyexample;

public class Money {
	static int value;
	String type;

	@Override
	public String toString() {
		return "Money [value=" + value + ", type=" + type + "]";
	}

	public Money(int value, String type) {
		super();
		this.value = value;
		this.type = type;

	}

	public static void main(String[] args) {
		Money m1 = new Money(25, "rupee");
		Money m2 = new Money(1, "dollar");
		System.out.println(m1 + "\n" + m2);
	}

}
