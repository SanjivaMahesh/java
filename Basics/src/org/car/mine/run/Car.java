package org.car.mine.run;

public class Car {
	String color;
	String brand = "honda";
	int price;
	int gear = 0;

	void moveForward() {
		System.out.println("move forward");
	}

	void display() {
		System.out.println(this.color + " " + this.price + " " + this.brand);
	}

	void shiftGearUp() {
		if (gear < 5)
			gear += 1;

		System.out.println("car is running on gear " + this.gear);
	}

	void shiftGearDown() {
		if (gear > 0)
			gear -= 1;
		System.out.println("car is running on gear" + this.gear);
	}

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "red";
		c1.price = 15000000;
		c1.moveForward();
		c1.display();
		Car c2 = new Car();
		c2.color = "blue";
		c2.price = 1000000;
		c2.moveForward();
		c2.display();
		Car c3 = new Car();
		c3.color = "silver";
		c3.price = 15000000;
		c3.moveForward();
		c3.display();
		c1.shiftGearUp();
		c1.shiftGearUp();

	}

}
