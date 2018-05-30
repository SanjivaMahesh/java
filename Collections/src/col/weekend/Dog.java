package col.weekend;

import java.util.ArrayList;

public class Dog {
	String name;

	public Dog(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Dog d = new Dog("snoopy");

		ArrayList<Dog> a = new ArrayList<Dog>();
		a.add(new Dog("x"));
		a.add(new Dog("t"));
		a.add(new Dog("s"));
		a.add(new Dog("u"));
		System.out.println(a);
	}

}
