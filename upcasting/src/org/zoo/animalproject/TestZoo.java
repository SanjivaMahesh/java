package org.zoo.animalproject;

public class TestZoo {
	public static void main(String[] args) {
		Zoo z=new Zoo();
		Animal a=z.sell();//upcasting becoz the method will return 
		//either cat,cow,lion object
		System.out.println(a);
		
		if (a!=null) {
			a.eat();
		}else {
			System.out.println("no animal to eat");// execute in seperate 
		}
	}

}
