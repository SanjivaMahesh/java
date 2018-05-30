package com.methodoverridingeg.inputdeviceexample;

public class Mouse extends InputDevice {
	@Override
	public void select() {
		System.out.println("press left click to select");
	}
	
	//sub class specific members

	void scroll() {
		System.out.println("scroll up and down");
	}
}
