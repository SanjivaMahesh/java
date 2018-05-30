package com.atm.money;

public class TestMoney {
	public static void main(String[] args) {
		Money m = new Money();
		Card c = new Card();
		ATM a = new ATM();
		Money paisa = a.withDraw(c, 12345);

	}

}
