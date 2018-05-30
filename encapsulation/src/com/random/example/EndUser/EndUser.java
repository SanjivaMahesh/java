package com.random.example.EndUser;

import java.util.Random;

import sun.applet.Main;

public class EndUser {
	int generate() {
		Random r=new Random();
		int n=r.nextInt();
		if (n<0) {
			n*=-1;
		}
		return  n;
		
}
	public static void main(String[] args) {
		EndUser e = new EndUser();
		System.out.println(e.generate() );
	}
}
