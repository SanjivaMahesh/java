package com.uielement.overridingexample;

public class TextBox extends UIElement {

	public TextBox() {
		super("text box", "name");

	}

	@override
	void action() {
		System.out.println("enter the text to activate");
	}
}
