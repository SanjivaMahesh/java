package org.casio.calculatorapp.calculator;

public class Converter {
	double convertDegreeCelsiusToFah(double celsius) {
		double fahrenheit = celsius * 1.8 + 32;
		return fahrenheit;

	}

	public static void main(String[] args) {
		Converter r = new Converter();
		double celsius = r.convertDegreeCelsiusToFah(38);
		System.out.println(celsius);

	}

}
