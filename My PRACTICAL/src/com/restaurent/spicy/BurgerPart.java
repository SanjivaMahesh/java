package com.restaurent.spicy;

public class BurgerPart {
	String name = "MC Donalds";
	int price;
	String type;
	boolean isCheesy;

	public BurgerPart(String type) {
		this( type, 150, true);
	}

	void show() {
		System.out.println(this.name+ " " + this.type + " " + this.price + " " + this.isCheesy);
	}

	public BurgerPart(int price, boolean isCheesy) {
		this( "Non Veg", 250, isCheesy);
	}

	public BurgerPart(String type, int price, boolean isCheesy) {
		this.type = type;
		this.price = price;
		this.isCheesy = isCheesy;
		this.show();
	}

	public static void main(String[] args) {
		BurgerPart bp = new BurgerPart("veg");
		BurgerPart bp1 = new BurgerPart(500, true);
		BurgerPart bp2 = new BurgerPart("Veg", 400, false);
		BurgerPart bp3 = new BurgerPart("NON veg", 350, true);

	}

}
