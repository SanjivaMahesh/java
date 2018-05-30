package org.pract.mine;

public class TypePro {
	void disp(float x) {
		System.out.println("float");
	}
	
	void disp(double d) {
		System.out.println("double");
	}
	
	public static void main(String[] args) {
		TypePro t=new TypePro();
		t.disp(10.10500);
		t.disp((int)10.10500);
	}

}
