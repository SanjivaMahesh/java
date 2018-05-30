package com.fish;

public class FisherMan {
	void fishing() {
		Ocean o = new Ocean();
		SeaCreatures s = o.give();
		if (s != null) {
			s.eat();
			s.sleep();
			s.swim();
			if (s instanceof Tortoise) {
				Tortoise t = (Tortoise) s;
				t.walk();
			} else if (s instanceof Crab) {
				Crab c = (Crab) s;
				c.walk();
			}
		} else {
			System.out.println("no sea creatures available of your choice");
		}
	}

}
