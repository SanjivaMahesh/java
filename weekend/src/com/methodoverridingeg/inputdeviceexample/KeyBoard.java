package com.methodoverridingeg.inputdeviceexample;

public class KeyBoard extends InputDevice {
	@Override
	public void select() {
		System.out.println("used for typing");
		super.select();
	}

}
