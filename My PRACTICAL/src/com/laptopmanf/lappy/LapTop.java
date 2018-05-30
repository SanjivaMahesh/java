 package com.laptopmanf.lappy;

import sun.applet.Main;

public class LapTop {
	String brand;
	int price;
	double screenSize;
	String color;
	int hardDiskCapacity;

	LapTop(int price) {
		this.price = price;
		this.brand = "dell";
		this.color = "blue";
		this.hardDiskCapacity = 500;
		this.screenSize = 14.5;
		this.display();
	}

	void display() {
		System.out.println(
				this.brand+ " " + this.color + " " + this.hardDiskCapacity + " " + this.screenSize + " " + this.price);
	}

	LapTop(double screenSize, String brand) {
		this.color = "black";
		this.price = 35000;
		this.screenSize = screenSize;
		this.brand = brand;
		this.hardDiskCapacity = 1000;
		this.display();
	}

	LapTop(String brand, int price, double screenSize, String color, int hardDiskCapacity) {
		this.brand = brand;
		this.price = price;
		this.screenSize = screenSize;
		this.color = color;
		this.hardDiskCapacity = hardDiskCapacity;
		this.display();
	}

	LapTop(String color) {
		this.color = color;
		this.brand = "apple";
		this.screenSize = 13.5;
		this.price = 68000;
		this.hardDiskCapacity = 250;
		this.display();

	}

	public static void main(String[] args) {
		LapTop l = new LapTop("hp", 26000, 15.7, "red", 750);
		LapTop l1 = new LapTop(28000);
		LapTop l2 = new LapTop(10.5, "mac");
		LapTop l3 = new LapTop("silver");

	}

}
