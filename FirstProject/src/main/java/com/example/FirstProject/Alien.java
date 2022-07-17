package com.example.FirstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Alien {
	private int aid;
	private String aname;
	private String atech;
	// we added auto wired to know the Alien that we have laptop object which is available 
	//auto wired by default search by type
	@Autowired
	@Qualifier("lap1")
	//Qualifier searches by name which is passed in the component
	private Laptop laptop;
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAtech() {
		return atech;
	}
	public void setAtech(String atech) {
		this.atech = atech;
	}
	public void show() {
		System.out.println("Aliend called.....!");
		laptop.compiler();
	}
	
	// for prototype it will create new bean instance every time it over-ride default singleton
}
