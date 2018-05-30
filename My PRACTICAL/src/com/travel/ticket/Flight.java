package com.travel.ticket;

public class Flight extends Ticket {

	void fly() {
		System.out.println("flight flies");
	}

	public Flight(String name, int amtOfTicket, String placeOfDeparture, String placeOfArrival, int noOfDaysToReach) {
		super(name, amtOfTicket, placeOfDeparture, placeOfArrival, noOfDaysToReach);

	}

}
