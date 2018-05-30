package org.mr.task.cat;

public class Cat {

	void eat(Fish f) {
		System.out.println("cat ate fish");
	}

	void eat(Rat r) {
		System.out.println("cat ate rat");
	}

	void eat(Cheese c) {
		System.out.println("cat ate cheese");
	}

	public static void main(String[] args) {
		Cat c = new Cat();
		Fish f = new Fish();
		Rat r = new Rat();
		Cheese ch = new Cheese();
 		c.eat(f);
		c.eat(ch);
		c.eat(r);
	}
}
