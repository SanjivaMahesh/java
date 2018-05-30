package com.visa;

public class Tester {
	public static void main(String[] args) {
		IndianVisa i = new IndianVisa();
		USVisa u = new USVisa();
		SomaliaVisa s = new SomaliaVisa();
		AfghanistanVisa a = new AfghanistanVisa();
		a.authorize();
		i.authorize();
		u.authorize();
		s.authorize();
	}

}
