package com.mr.abstarct.mobilemanf;

import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class Tester {
	public static void main(String[] args) {
		System.out.println("which website you wanted to shop on?");
		Scanner s = new Scanner(System.in);
		String name = s.next();
		AbstractShoppingWebsite website = null;
		if (name.equalsIgnoreCase("FlipKart")) {
			website = new FlipKart();

		} else if (name.equalsIgnoreCase("Amazon")) {
			website = new Amazon();
		}
		if (website instanceof FlipKart) {
			FlipKart f = (FlipKart) website;
			f.search();
		} else if (website instanceof Amazon) {
			Amazon a = (Amazon) website;
			a.bookMovieTickets();
		}

		else {
			System.out.println("website not found");
		}

	}
}
