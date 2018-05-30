package org.casio.calculatorapp.calculator;

public class Conversion {
	int convertHourToMinute(int hour) {
		int minutes = hour * 60;
		return minutes;
	}

	public static void main(String[] args) {
		Conversion co = new Conversion();
		int minutes = co.convertHourToMinute(2);
		System.out.println(minutes);
	}
}
