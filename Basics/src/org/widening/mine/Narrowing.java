package org.widening.mine;

public class Narrowing {
	public static void main(String[] args) {
		byte b=126;
		long l=123456789L;
		short s=(short)l;
		System.out.println(s);
		
		int i=255;
		byte x=(byte)i;
		System.out.println(i+"  "+x);
		
		byte t=10;
		t=(byte)(t+20);
		System.out.println(t);
		
		float f=55;
		double d=f;
		System.out.println(d);
		
		float fg=92;
		int ig=(int)fg;
		System.out.println(ig);
		
		 
		
	}

}
