package com.websites.data;

public class Tester {
	void storeData() {
		System.out.println("Stored data");
	}

	public static void main(String[] args) {
		JDBC o = new Oracle();
		JDBC m = new MicroSoftSql();
		JDBC q = new MySql();
		o.getConnection("xyz", "abc", "123");
		m.getConnection("get", "bng", "456");
		q.getConnection("ijk", "ghj", "789");

	}

}
