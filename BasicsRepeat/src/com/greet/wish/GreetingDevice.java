package com.greet.wish;

public class GreetingDevice {
	void wish() {
		System.out.println("hello");
	}

	void wish(String name) {
		System.out.println("hello " + name);
	}

	public static void main(String[] args) {
		GreetingDevice h = new GreetingDevice();
		h.wish();// hello
		h.wish("mahesh");// hello mahesh
		h.wish("bob");// hello bob
	}

}
