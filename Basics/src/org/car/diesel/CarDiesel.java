package org.car.diesel;

public class CarDiesel {
	public static void main(String[] args) {
		Car c=new Car();
		Diesel d=new Diesel();
		ElectricCharge ec=new ElectricCharge();
		c.fill(d);
		c.fill(ec);
		
	}

}
