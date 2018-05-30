package org.student.drinks;

public class StudentDrinks {
	public static void main(String[] args) {
		Student s=new Student();
		Juice j=new Juice();
		Coffee c=new Coffee();
		s.drinks(c);
		s.drinks(j);
	}

}
