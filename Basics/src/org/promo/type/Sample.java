package org.promo.type;

public class Sample {
	void show(int x) {
		System.out.println(x);
		
	}
	
	void show(long l) {
		System.out.println(l);
	}
	
	void show (double x) {
		System.out.println(x);
	}
	  
	public static void main(String[] args) {
		Sample s=new Sample();
		s.show('A');
		byte b=5;
		s.show(b);
		long l=54897l;
		s.show(l);
	}

}
