package org.mr.task.airconditioner;

public class AirConditioner {

	Air blow(Water w) {
		System.out.println("Creating object of air");
		Air a = new Air();
		System.out.println("throws air out");
		return a;

	}

	public static void main(String[] args) {
		AirConditioner ac = new AirConditioner();
		Water w = new Water();
		Air a = ac.blow(w);
		System.out.println("ac blows air");
	}

}
