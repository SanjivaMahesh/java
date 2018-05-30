package com.pro.table;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your number");
		int n = s.nextInt();
		s.close();
		int i;
		for (int i1=1;i1<=10;i1++) {
			System.out.println(n+"*"+i1+"="+n*i1);
		}
		
	}

}
