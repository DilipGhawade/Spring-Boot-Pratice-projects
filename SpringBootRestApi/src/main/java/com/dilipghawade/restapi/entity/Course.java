package com.dilipghawade.restapi.entity;

import java.util.jar.Attributes.Name;

public class Course {
	private int id;
	private String nameString;
	private String auhorString;
	
	
	public Course(int id, String nameString, String auhorString) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.auhorString = auhorString;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String getAuhorString() {
		return auhorString;
	}
	public void setAuhorString(String auhorString) {
		this.auhorString = auhorString;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", nameString=" + nameString + ", auhorString=" + auhorString + "]";
	}
	
	

}
