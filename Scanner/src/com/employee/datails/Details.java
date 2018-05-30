package com.employee.datails;

import java.util.Scanner;

import org.omg.CORBA.FloatHolder;

public class Details {
	String name;
	int age;
	long mobileNo;
	String fatherName;
	String motherName;
	String panNo;
	long aadharNo;
	String address;
	int pinCode;
	String martialStatus;
	int account;

	@Override
	public String toString() {
		return "Details [name=" + name + ", \nage=" + age + ", \nmobileNo=" + mobileNo + ", \nfatherName=" + fatherName
				+ ", \nmotherName=" + motherName + ", \npanNo=" + panNo + ", \naadharNo=" + aadharNo + ", \naddress="
				+ address + ", \npinCode=" + pinCode + ", \nmartialStatus=" + martialStatus + "]";
	}

	public static void main(String[] args) {
		Details d = new Details();
		Scanner s = new Scanner(System.in);
		System.out.println("enter your name");
		d.name = s.nextLine();
		System.out.println("enter your age");
		d.age = s.nextInt();
		System.out.println("enter your mobile number");
		d.mobileNo = s.nextLong();
		System.out.println("enter your father name");
		s.nextLine();
		d.fatherName = s.nextLine();
		System.out.println("enter your mother name");
		d.motherName = s.nextLine();
		System.out.println("enter your pan number");
		d.panNo = s.next();
		System.out.println("enter your aadhar number");
		d.aadharNo = s.nextLong();
		System.out.println("enter your address");
		s.nextLine();
		d.address = s.nextLine();
		System.out.println("enter your martial status");
		d.martialStatus = s.next();
		System.out.println(d);
		d.account = s.nextInt();

	}

}
