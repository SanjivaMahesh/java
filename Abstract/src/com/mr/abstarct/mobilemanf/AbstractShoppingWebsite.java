package com.mr.abstarct.mobilemanf;

public abstract class AbstractShoppingWebsite {
	abstract void addToCart();

	abstract void pay();

	void login() {
		System.out.println("user logged in with valid credentials");
	}

	

}
