package com.mr.ass.employee;

public class Employee {
	int age;
	String gender;
	int yearOfJoining;
	Address addr = new Address();
	BankAccount ba;
	Name name = new Name();
	Pan p;

	@Override
	public String toString() {
		return "Hello " + this.name.firstName + " " + this.name.lostName + " " + " ! you are " + this.gender + " "
				+ " joined in  the year " + " " + this.yearOfJoining + " " + "and your pan details are updated as "
				+ this.p + " and your address is " + this.addr.doorNo + this.addr.street + this.addr.city
				+ " and Bank details is " + this.ba.accNo + this.ba.ifscCode + this.ba.type;
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.age = 25;
		e.gender = "male";
		e.yearOfJoining = 2016;

		e.name.firstName = "MAHESH";
		e.name.lostName = "KURUVA";

		e.addr.doorNo = 120;
		e.addr.street = "BTM";
		e.addr.city = "BANGLORE";

		Pan p = new Pan();
		p.nameOnCard = e.name.firstName + " " + e.name.lostName;
		p.panNo = "ABCD123456";

		e.p = p;
		e.ba = new BankAccount();
		e.ba.accNo = 622_824_301_144l;
		e.ba.ifscCode = "SB150245";
		e.ba.type = "SAVINGS";
		System.out.println(e);
	}

}
