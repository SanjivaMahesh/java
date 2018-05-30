package org.mine.bottle;

public class BottleStores {
	public static void main(String[] args) {
		Bottle b=new Bottle();
		Juice j=new Juice();
		Oil o=new Oil();
		b.stores(j);
		b.stores(o);
	}

}
