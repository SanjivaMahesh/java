package com.mr.associationexample.address;

public class Address {
	int doorNo;
	String street;
	String city;
	int pincode;

	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", street=" + street + ", city=" + city + ", pincode=" + pincode
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
