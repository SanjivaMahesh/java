package com.websites.data;

public class Oracle implements JDBC {

	@Override
	public void getConnection(String url, String userName, String pwd) {
		System.out.println("connected to ORACLE");
	}

}
