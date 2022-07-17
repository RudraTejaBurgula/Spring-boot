package com.learner.webapp.Bean;

import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("SomeBean")
public class Aliean {
	private int aid;
	private String aname;
	private String alang;
	public Aliean(int aid, String aname, String alang) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.alang = alang;
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
	public String getAlang() {
		return alang;
	}
	public void setAlang(String alang) {
		this.alang = alang;
	}
	
}
