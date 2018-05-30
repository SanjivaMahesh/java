package com.accesories.mouse;

public class LenovoImpl implements IMouse {

	public static void main(String[] args) {
		IMouse l = new LenovoImpl();
		System.out.println(l);
		l.scrollDown();
		l.scrollUp();
	}

	@Override
	public void scrollDown() {
		System.out.println("SCROLL DOWN");
	}

	@Override
	public void scrollUp() {
		System.out.println("SCROLL UP");
	}
}
