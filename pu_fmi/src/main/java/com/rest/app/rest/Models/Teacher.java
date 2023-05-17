package com.rest.app.rest.Models;
import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {
	private List<Subject> subjects = new ArrayList<>();
	private Class school_class;
	private int experience;
	private String phoneNumber;
	
	public Teacher() {
		
	}
	
	public Teacher(String name, String password, String email) {
		super.name = name;
		super.password = password;
		super.email = email;
	}
	
	public Class getSchool_class() {
		return school_class;
	}
	
	public void setSchool_class(Class school_class) {
		this.school_class = school_class;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
