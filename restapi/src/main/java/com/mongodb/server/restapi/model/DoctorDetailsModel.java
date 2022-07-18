package com.mongodb.server.restapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "doctordetails")
public class DoctorDetailsModel {
	@Id
	private int doc_id;
	private String doc_name;
	private String hosp_name;
	private String hosp_location;
	private String doc_number;
	private String spec_name;
	private Object date;
	
	public int getDoc_id() {
		return doc_id;
	}
	public void setDoc_id(int doc_id) {
		this.doc_id = doc_id;
	}
	public String getDoc_name() {
		return doc_name;
	}
	public void setDoc_name(String doc_name) {
		this.doc_name = doc_name;
	}
	public String getHosp_name() {
		return hosp_name;
	}
	public void setHosp_name(String hosp_name) {
		this.hosp_name = hosp_name;
	}
	public String getHosp_location() {
		return hosp_location;
	}
	public void setHosp_location(String hosp_location) {
		this.hosp_location = hosp_location;
	}
	public String getDoc_number() {
		return doc_number;
	}
	public void setDoc_number(String doc_number) {
		this.doc_number = doc_number;
	}
	public String getSpec_name() {
		return spec_name;
	}
	public void setSpec_name(String spec_name) {
		this.spec_name = spec_name;
	}
	public Object getDate() {
		return date;
	}
	public void setDate(Object date) {
		this.date = date;
	}
}
