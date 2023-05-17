package com.rest.app.rest.Models;
import java.util.ArrayList;
import java.util.List;

public class Parent extends User {
	private List<Grade> childGrades = new ArrayList<>();
	private String address;
	private String profession;
	
	public Parent() {
		
	}
	
	public Parent(String name, String password, String email) {
		super.name = name;
		super.password = password;
		super.email = email;
	}
	
	public List<Grade> getChildGrades() {
		return childGrades;
	}
	
	public void setChildGrades(List<Grade> childGrades) {
		this.childGrades = childGrades;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}
}
