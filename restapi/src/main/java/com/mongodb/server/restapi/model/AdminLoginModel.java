package com.mongodb.server.restapi.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="adminLogin")
public class AdminLoginModel {
	private String username;
	private String password;
	
	
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	
}
