package com.mr.vehi.car;

public class Vehicle {
	String color;
	int price;
	Vehicle (String color,int price){
		this.color=color;
		this.price=price;
	}
	void start() {
		System.out.println("start");
	}

}
