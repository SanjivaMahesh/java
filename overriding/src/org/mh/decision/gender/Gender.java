package org.mh.decision.gender;

public class Gender {
	String genderDecision(int n) {
		if (n == 1) {
			return "boy";
		} else if (n == 2) {
			return "girl";
		} else {
			return "nill";
		}
	}

	public static void main(String[] args) {

		Gender g = new Gender();
		System.out.println(g.genderDecision(0));
		System.out.println(g.genderDecision(1));
		System.out.println(g.genderDecision(2));	

	}
}