package org.pract.mine;

public class Gold {
	double qty;
	double price;
	Gold(double qty){
		this.qty=qty;
		this.price=qty*2526.89;
		display();
	}
	void display() {
		System.out.println(this.qty+" "+this.price);
	}
	public static void main(String[] args) {
		Gold g=new Gold(50);
			}

}
