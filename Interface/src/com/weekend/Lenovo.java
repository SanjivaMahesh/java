package com.weekend;

public class Lenovo implements IMouse {

	@Override
	public void rightClick() {
		System.out.println("right click");
	}

	@Override
	public void leftClick() {
		System.out.println("left click");
	}

	@Override
	public void scroll() {
		System.out.println("scroll");
	}

}
