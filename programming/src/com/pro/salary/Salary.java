package com.pro.salary;

import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter name: ");
		String name = s.next();
		System.out.println("enter id: ");
		int id = s.nextInt();
		System.out.println("enter salary: ");
		int salary = s.nextInt();
		int HRA = 10 * salary / 100;
		System.out.println("HRA: " + HRA);
		int TA = 10 * salary / 100;
		System.out.println("TA: " + TA);
		int MI = 7 * salary / 100;
		System.out.println("MI: " + MI);
		int TDS = 5 * salary / 100;
		System.out.println("TDS: " + TDS);
		int netSalary = (salary + HRA + TA - (MI + TDS));
		System.out.println("net salary of an employee is:" + netSalary);
		s.close();
	}

}
