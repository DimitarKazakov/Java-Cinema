package com.rest.app.rest.Models;
import java.util.ArrayList;
import java.util.List;

public class Student extends User {
	private List<Grade> grades = new ArrayList<>();
	private Class school_class;
	private int year;
	private double averageScore;
	
	public Student() {
		
	}
	
	public Student(String name, String password, String email) {
		super.name = name;
		super.password = password;
		super.email = email;
	}
	
	public List<Grade> getGrades() {
		return grades;
	}
	
	public void setGrades(List<Grade> grades) {
		this.grades = grades;
	}

	public Class getSchool_class() {
		return school_class;
	}

	public void setSchool_class(Class school_class) {
		this.school_class = school_class;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getAverageScore() {
		return averageScore;
	}

	public void setAverageScore(double averageScore) {
		this.averageScore = averageScore;
	}
}
