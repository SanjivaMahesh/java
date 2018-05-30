package org.non.prim;

public class Cooler {
	Air cool(coldWater cw) {
		Air a=new Air();
		return a;
	}
	public static void main(String[] args) {
		Cooler c=new Cooler();
		 c.cool(new coldWater());
		System.out.println("cooler gives fresh air");
	}

}
