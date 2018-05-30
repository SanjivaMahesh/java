package com.puma.shoeproject;

public class Shoe {
	String color;
	String material;
	String brand="puma";
	int size;
	public Shoe(int size) {
		this.size = size;
		this.color="black";
		this.material="leather";
		this.show();
	}
	void show() {
		System.out.println(this.size+" "+this.color+" "+this.brand+" "+this.material);
	}
	public Shoe(int size, String color) {
		this.size = size;
		this.color = color;
		this.material="polymer";
		this.show();
	}
	public Shoe(int size, String color, String material) {
		this.size = size;
		this.color = color;
		this.material = material;
		this.show();
	}
	public static void main(String[] args) {
		Shoe s=new Shoe(8,"white","waterprrof");
		Shoe s1=new Shoe(9, "blue");
		Shoe s2=new Shoe(7); 
	}
	

}
