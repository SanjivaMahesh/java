package org.fan.air;

public class Fan {
	public static void main(String[] args) {
		Fan f=new Fan();
		System.out.println(f.color);
		f.color="blue";
		f.price=5000;
		f.brand="samsung";
		System.out.println(f.color);
		System.out.println(f.brand);
		System.out.println(f.price);
		System.out.println(f.noOfBlades);
		f.showDetails();
	
		
	}
	String brand;
	String color;
	int price;
	
	String noOfBlades="3";
	void blowAir() {
		System.out.println("blows air");
	}
	
	void showDetails() {
		System.out.println(this.brand+" "+this.color);
	}
	

}
