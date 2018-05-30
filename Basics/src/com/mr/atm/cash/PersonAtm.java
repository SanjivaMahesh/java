package com.mr.atm.cash;

public class PersonAtm {
	public static void main(String[] args) {
		Atm m= new Atm();
		Card d= new Card();
		m.withDraw(d);
	}

}
