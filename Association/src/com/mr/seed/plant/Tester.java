package com.mr.seed.plant;

public class Tester {
	public static void main(String[] args) {
		Seed s = new Seed();
		Plant p = s.givePlant();
		Tree t = p.giveTree();
		Oxygen o = t.giveOxygen();
		o.breath();

		new Seed().givePlant().giveTree().giveOxygen().breath();

	}

}
