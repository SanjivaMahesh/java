package com.qspiders.idgenerator;

public class Tester {
	public static void main(String[] args) {
		IdCard i1 = new IdCard();
		IdCard i2 = new IdCard();
		System.out.println(i1);// null 0 null
		System.out.println(i2);// null 0 null
		i1.branch = "btm";
		i1.mobileNo = 12345L;
		i1.name = "mahesh";

		i2.branch = "axa";
		System.out.println(i2.branch);// axa

		System.out.println(i1.name + " " + i1.mobileNo + " " + i1.branch);// mahesh 12345 btm
	}

}
