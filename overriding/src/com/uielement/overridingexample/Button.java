package com.uielement.overridingexample;

public class Button extends UIElement {

	public Button() {
		super("button", "button type");
	}

	void action() {
		System.out.println("click to activate");
	}

	void show() {
		System.out.println("display button");
	}
}
