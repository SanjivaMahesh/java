package com.embassy.exc;

public class Exchange {
	void convertRupeesToUSD(double rupees) {
		double USD = rupees / 64.8;
		double comm = USD * 0.03;
		double totalValue = USD - comm;
		System.out.println("the total conversion value is " + USD);
		System.out.println("the total commission is " + comm);
		System.out.println("final dollar you get is " + totalValue);
	}

	public static void main(String[] args) {
		Exchange e = new Exchange();
		e.convertRupeesToUSD(10000);
	}

}
