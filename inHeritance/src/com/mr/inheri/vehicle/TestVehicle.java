package com.mr.inheri.vehicle;

public class TestVehicle {
	public static void main(String[] args) {
		Car c=new Car();
		c.brand="bmw";
		c.color="black";
		c.isAcPresent=true;
		c.noOfSeatBelts=4;
		c.price=13000000;
		c.move();
		c.start();
		c.stop();
		c.temperatureControl();
	}

}
