package com.travel.ticket;

public class Tester {
	public static void main(String[] args) {
		Bus b = new Bus("mahesh", 500, "banglore", "kurnool", 1);
		System.out.println(b);
		System.out.println(b.name + " " + b.amtOfTicket + " " + b.placeOfArrival + " " + b.placeOfDeparture + " "
				+ b.noOfDaysToReach);

		Bike c = new Bike();

		Flight f = new Flight("raaz", 200000, "London", "INDIA", 3);
		System.out.println(f.name + " " + f.amtOfTicket + " " + f.placeOfArrival + " " + f.placeOfDeparture + " "
				+ f.noOfDaysToReach);
	}

}
