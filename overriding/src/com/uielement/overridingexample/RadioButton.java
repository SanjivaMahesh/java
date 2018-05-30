package com.uielement.overridingexample;

public class RadioButton extends UIElement {
	public RadioButton() {
		super("radio button", "radio value");
	}

	void action() {
		System.out.println("click on the radio button");
	}

}
