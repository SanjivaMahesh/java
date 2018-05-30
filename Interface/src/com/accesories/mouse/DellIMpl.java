package com.accesories.mouse;

public class DellIMpl implements IMouse {

	@Override
	public void scrollUp() {
		System.out.println("SCROLL UP");
	}

	@Override
	public void scrollDown() {
		System.out.println("SCROLL DOWN");
	}

	public static void main(String[] args) {
		IMouse d = new DellIMpl();
		System.out.println(d);
		d.scrollUp();
		d.scrollDown();
		
	}

}
