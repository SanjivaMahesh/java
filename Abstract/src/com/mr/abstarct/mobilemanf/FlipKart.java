package com.mr.abstarct.mobilemanf;

public class FlipKart extends AbstractShoppingWebsite {

	@Override
	void addToCart() {
		System.out.println("added to cart");

	}

	@Override
	void pay() {
		System.out.println("paid");

	}
	
	void search() {
		System.out.println("search for products");
	}

}
