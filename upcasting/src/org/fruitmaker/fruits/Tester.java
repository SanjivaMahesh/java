package org.fruitmaker.fruits;

public class Tester {
	public static void main(String[] args) {
		Lemon l = new Lemon();
		l.prepareJuice();
		l.clean();
		
		Apple a = new Apple();
		a.clean();a.prepareJuice();
		MuskMelon m = new MuskMelon();
		m.clean();
		m.prepareJuice();
	}

}
