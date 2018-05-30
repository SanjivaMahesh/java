package com.websites.data;

public class MicroSoftSql implements JDBC {

	@Override
	public void getConnection(String url, String userName, String pwd) {
		System.out.println("connected to MICROSOFTSQL");
	}

}
