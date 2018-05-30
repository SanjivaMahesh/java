package com.cast.upcastinh;

public class Y extends X {
	static void display() {
		System.out.println("display y");
	}

	public static void main(String[] args) {
		X.display();
		Y.display();
	}

}
