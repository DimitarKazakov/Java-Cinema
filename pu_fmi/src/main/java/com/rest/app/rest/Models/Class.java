package com.rest.app.rest.Models;
import java.util.List;
import java.util.ArrayList;

public class Class {
	private List<Student> students = new ArrayList<>();
	private List<Subject> subjects = new ArrayList<>();
	private String number;
	private Teacher teacher;
	
	public Class() {
		
	}
	
	public Class(String number) {
		this.number = number;
	}
	
	public List<Student> getStudents() {
		return students;
	}
	
	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
}
