package com.websites.data;

public class MySql implements JDBC {

	@Override
	public void getConnection(String url, String userName, String pwd) {
		System.out.println("connected to MYSQL");
	}

}
