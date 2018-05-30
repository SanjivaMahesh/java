package com.mr.association.address;

public class Office {
	String name;
	long phoneNo;
	Address address;
	

	@Override
	public String toString() {
		return "Office [name=" + name + ", phoneNo=" + phoneNo + ", address=" + address + "]";
	}


	public static void main(String[] args) {
		Office o = new Office();
		o.name = "J SPIDERS";
		o.phoneNo = 9985545655L;
		o.address = new Address();
		System.out.println(o);
		System.out.println(o.address);
		o.address.doorNo=10;
		o.address.street="BTM";
		o.address.city="banglore";
		o.address.pinCode=560076;
		System.out.println(o);
		
		

	}

}
