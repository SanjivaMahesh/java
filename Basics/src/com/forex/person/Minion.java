package com.forex.person;

public class Minion {
	public static void main(String[] args) {

		Minion b=new Minion();
		b.talk();
		b.walk();
		b.sleep();

	}
	String name= "bob";
	String colour="yellow";
	byte noOfLegs=2;
	byte noOfHands=2;
	float height=3f;

	void sleep() {
		System.out.println("sleep");
	}

	void talk() {
		System.out.println("talk");
	}
	void walk() {
		System.out.println("walk");
	}
}