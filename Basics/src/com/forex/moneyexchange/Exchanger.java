package com.forex.moneyexchange;

public class Exchanger {
      double convertUsdToInr(double dollar) {
    	  double inr=dollar*64.91*0.98;
    	  return inr;
      }
      public static void main(String[] args) {
		Exchanger ex = new Exchanger();
		double inr=ex.convertUsdToInr(10);
		System.out.println((int)inr);
	}
}
