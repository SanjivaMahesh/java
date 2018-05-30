package com.travel.ticket;

public class Ticket {
	String name;
	int amtOfTicket;
	String placeOfDeparture;
	String placeOfArrival;
	int noOfDaysToReach;

	public Ticket(String name, int amtOfTicket, String placeOfDeparture, String placeOfArrival, int noOfDaysToReach) {
		this.name = name;
		this.amtOfTicket = amtOfTicket;
		this.placeOfDeparture = placeOfDeparture;
		this.placeOfArrival = placeOfArrival;
		this.noOfDaysToReach = noOfDaysToReach;
	}

}
