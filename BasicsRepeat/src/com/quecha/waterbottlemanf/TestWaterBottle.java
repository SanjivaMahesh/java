package com.quecha.waterbottlemanf;

public class TestWaterBottle {
	public static void main(String[] args) {
		WaterBottle w1 = new WaterBottle();
		WaterBottle w2 = new WaterBottle();
		WaterBottle w3 = new WaterBottle();
		WaterBottle w4 = new WaterBottle();// first type new then type object name (ctrl+space) enter then ctrl+1+enter

		w1.color = "green";
		w2.price = 300;
		w4.height = 10.2;
		System.out.println(w1);// w1.color
		System.out.println(w2);// w2.price
		System.out.println(w3);// w3.height
	}

}
