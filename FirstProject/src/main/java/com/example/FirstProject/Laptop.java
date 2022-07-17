package com.example.FirstProject;

import org.springframework.stereotype.Component;

@Component("lap1")
public class Laptop {
	private int lid;
	private String lname;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public void compiler() {
		System.out.println("compliation started.....");
	}
}
