package com.accessmodifer.eg;

public class BankAccount {
	private int balance = 12456;
	String accountType = "savings";

	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		System.out.println(b.balance);
		System.out.println(b.accountType); 
	}

}
