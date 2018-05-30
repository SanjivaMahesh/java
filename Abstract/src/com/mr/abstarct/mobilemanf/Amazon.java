package com.mr.abstarct.mobilemanf;

public class Amazon extends AbstractShoppingWebsite {

	@Override
	void addToCart() {
		System.out.println("added to cart");

	}

	@Override
	void pay() {
		System.out.println("paid");
	}

	void bookMovieTickets() {
		System.out.println("booking open for movie tickets");
	}

}
