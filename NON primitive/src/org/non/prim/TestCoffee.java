package org.non.prim;

public class TestCoffee {
	public static void main(String[] args) {
		System.out.println("water pour into machine");
		CoffeeMachine cm=new CoffeeMachine();
		System.out.println("add coffeebeans");
		Coffee c=cm.prepareCoffee(new water(),new coffeeBean());
		System.out.println("collect d coffee");
	}

}
