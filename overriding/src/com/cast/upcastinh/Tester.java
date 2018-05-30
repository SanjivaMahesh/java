package com.cast.upcastinh;

import com.uielement.overridingexample.Person;

public class Tester {
	
	public String toString() {
		System.out.println(super.toString());
		return "Animal";
	}
public static void main(String[] args) {
	Person a = new Person();
	System.out.println(a);
}
}
