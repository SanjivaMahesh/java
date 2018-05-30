package com.fuel.petrol;

public class PetrolPump {
	void calculateAmountOfPetrol(double money) {
		double litres = money / 74.38;
		System.out.println("you get " + litres + " " + "litres of fuel");
	}

	public static void main(String[] args) {
		PetrolPump p = new PetrolPump();
		p.calculateAmountOfPetrol(450);
		p.calculateAmountOfPetrol(150.368);
	}
}
