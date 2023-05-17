package com.rest.app.rest.Models;
import java.util.ArrayList;
import java.util.List;

public class Subject {
	private String name;
	private Teacher teacher;
	private List<Class> schoolClass = new ArrayList<>();
	private List<Grade> grades = new ArrayList<>();
	
	public Subject() {
		
	}
	
	public Subject(String name) {
		this.name = name;
	}
	
	public List<Grade> getGrades() {
		return grades;
	}
	public void setGrades(List<Grade> grades) {
		this.grades = grades;
	}
	
	public List<Class> getSchoolClass() {
		return schoolClass;
	}
	
	public void setSchoolClass(List<Class> schoolClass) {
		this.schoolClass = schoolClass;
	}
	
	public Teacher getTeacher() {
		return teacher;
	}
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
