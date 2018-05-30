package com.uielement.overridingexample;

public class UIElement {
	String name;
	String type;

	public UIElement(String name, String type) {
	
	}

	void action() {
		System.out.println(this.name + " " + this.type);
	}

}
