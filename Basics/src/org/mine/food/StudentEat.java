package org.mine.food;

public class StudentEat {
	public static void main(String[] args) {
		Roti r=new Roti();
		Chocolate c=new Chocolate();
		Pizza p=new Pizza();
		Student s=new Student();
		s.eat(c);
		s.eat(p);
		s.eat(r);
				
	}

}
