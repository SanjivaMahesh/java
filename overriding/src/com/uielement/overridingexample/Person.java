package com.uielement.overridingexample;

public class Person {
	void browse() {
		Browser b = new Browser();
		UIElement u = b.getElement("www.gmail.com");
		System.out.println(u.type + " " + u.name);
		u.action();
		Button bu = (Button)u;
		bu.show();
	}

	public static void main(String[] args) {
		Person p = new Person();
		p.browse();
		System.out.println(p);
	}
}
