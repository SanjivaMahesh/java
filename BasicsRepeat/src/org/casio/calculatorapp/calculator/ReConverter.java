package org.casio.calculatorapp.calculator;

public class ReConverter {
	double convertFahreinheitToDegreeCelsius(double fah)
	{
		double celsius=(fah-32)/1.8;
		return celsius;
	}
	public static void main(String[] args) {
		ReConverter ec = new ReConverter();
		double celsius=ec.convertFahreinheitToDegreeCelsius(100.4);
		System.out.println(celsius);
	}

}
