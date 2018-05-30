package org.pract.mine;

public class Division {
	void div(int a, int b) {
		int res=a/b;
		System.out.println(res);
	}
	public static void main(String[] args) {
		Division d=new Division();
		d.div(100, 25);
	}

}
