package org.casio.calculatorapp.calculator;

public class GSTCalculator {
	void calculateGST(double productprice) {
		double gst = productprice * 0.18;
		double totalCost = productprice + gst;
		System.out.println("the base price of product is " + productprice);
		System.out.println("GST of product is " + gst);
		System.out.println("total cost of product is " + totalCost);
	}

	public static void main(String[] args) {
		GSTCalculator g = new GSTCalculator();
		g.calculateGST(500);

	}
}
