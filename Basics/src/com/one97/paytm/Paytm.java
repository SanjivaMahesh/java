package com.one97.paytm;

public class Paytm {
	public static void main(String[] args) {
		Paytm p=new Paytm();
		p.login(9182640862l, "mahesh1234");
		p.login("mahi@gmail.com", "mahesh1234");
		
	}
	
	void login(long phoneNo, String pwd) {
		System.out.println("login through phoneno and pwd");
	}
	void login(String email, String pwd) {
		System.out.println("login through email and pwd");
		}
	

}
