package com.override.atm;

public class Tester {
	public static void main(String[] args) {
		ICICI i = new ICICI();
		Qatm q = new Qatm();
		CitiAtm c = new CitiAtm();
		i.withDraw();
		q.withDraw();
		c.withDraw();
	}

}
