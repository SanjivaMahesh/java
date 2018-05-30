package com.mr.abstarct.IMC;

public abstract class AbstractIMC {
	public static void main(String[] args) {
		SamsungMobile sm = new SamsungMobile();
		sm.call();
		sm.sms();
		sm.sos();
		sm.bluetooth();
		AbstractIMC am = sm;
		am.call();
		am.sms();
		am.sos();
		if(am instanceof SamsungMobile) {
			SamsungMobile sm1=(SamsungMobile) am;
			sm1.bluetooth();
					
					
		}
		
	}

	abstract void call();

	abstract void sms();

	void sos() {
		System.out.println("emergency");
	}
}
