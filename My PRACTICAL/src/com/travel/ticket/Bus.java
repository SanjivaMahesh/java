package com.travel.ticket;

public class Bus extends Ticket {
	public Bus(String name, int amtOfTicket, String placeOfDeparture, String placeOfArrival, int noOfDaysToReach) {
		super(name, amtOfTicket, placeOfDeparture, placeOfArrival, noOfDaysToReach);

	}

	void move() {
		System.out.println("bus moves");
	}

}
