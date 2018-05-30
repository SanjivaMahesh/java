package com.methodoverridingeg.inputdeviceexample;

public class Tester {
	public static void main(String[] args) {
		InputDevice id = new InputDevice();
		id.select();
		if (id instanceof Mouse) {
			Mouse m = (Mouse) id;
			m.scroll(); 
		}
	}

}
