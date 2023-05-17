package com.rest.app.rest;
import java.util.ArrayList;
import java.util.List;

import com.rest.app.rest.Models.Class;
import com.rest.app.rest.Models.Grade;
import com.rest.app.rest.Models.Parent;
import com.rest.app.rest.Models.Student;
import com.rest.app.rest.Models.Subject;
import com.rest.app.rest.Models.Teacher;

public class DB {
	private List<Class> classes = new ArrayList<>();
	private List<Grade> grades = new ArrayList<>();
	private List<Parent> parents = new ArrayList<>();
	private List<Student> students = new ArrayList<>();
	private List<Subject> subjects = new ArrayList<>();
	private List<Teacher> teachers = new ArrayList<>();
	
	public DB(){
		this.SeedData();
	}
	
	public void TruncateData() {
		this.classes.removeAll(classes);
		this.grades.removeAll(grades);
		this.teachers.removeAll(teachers);
		this.students.removeAll(students);
		this.subjects.removeAll(subjects);
		this.parents.removeAll(parents);
	}
	
	public void SeedData() {
		if(this.classes.isEmpty()) {
			this.SeedClasses();
		}
		
		if(this.subjects.isEmpty()) {
			this.SeedSubjects();
		}
		
		if(this.students.isEmpty()) {
			this.SeedStudents();
		}
		
		if(this.grades.isEmpty()) {
			this.SeedGrades();
		}

		if(this.parents.isEmpty()) {
			this.SeedParents();
		}


		if(this.teachers.isEmpty()) {
			this.SeedTeachers();
		}
	}
	
	private void SeedClasses() {
		var s1 = new Subject("Mathematics");
		var s2 =new Subject("Physics");
		var s3 = new Subject("Biology");
		var s4 = new Subject("Chemistry");
		var s5 = new Subject("Music");
		
		var c1 = new Class("7A");
		var c2 = new Class("7B");
		var c3 = new Class("7C");
		var c4 = new Class("7D");
		var c5 = new Class("6A");
		var c6 = new Class("6B");
		
		var list = new ArrayList<Subject>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		c1.setSubjects(list);
		c2.setSubjects(list);
		c3.setSubjects(list);
		c4.setSubjects(list);
		list.add(s4);
		c5.setSubjects(list);
		list.add(s5);
		c6.setSubjects(list);
		
		this.classes.add(c1);
		this.classes.add(c2);
		this.classes.add(c3);
		this.classes.add(c4);
		this.classes.add(c5);
		this.classes.add(c6);
	}
	
	private void SeedGrades() {
		this.grades.add(new Grade(5, this.subjects.get(0), "very good performance"));
		this.grades.add(new Grade(6, this.subjects.get(1), "excellent"));
	}

	private void SeedStudents() {
		var st1 = new Student("Georgi Ivanov", "iv123", "stu.ivanov@gmail.com");
		var st2 = new Student("Maria Smith", "mr123", "stu.smith@gmail.com");
		
		var gr1 = new ArrayList<Grade>();
		gr1.add(new Grade(5, this.subjects.get(0), "very good performance"));
		gr1.add(new Grade(3, this.subjects.get(0), "average"));
		st1.setGrades(gr1);
		
		var gr2 = new ArrayList<Grade>();
		gr2.add(new Grade(6, this.subjects.get(0), "Excellent"));
		gr2.add(new Grade(6, this.subjects.get(1), "Excellent"));
		st2.setGrades(gr2);
		
		this.students.add(st1);
		this.students.add(st2);
	}
	
	private void SeedSubjects() {
		this.subjects.add(new Subject("Mathematics"));
		this.subjects.add(new Subject("Physics"));
		this.subjects.add(new Subject("Biology"));
		this.subjects.add(new Subject("Chemistry"));
	}
	
	private void SeedTeachers() {
		this.teachers.add(new Teacher("Mrs. Ivanova", "ivanova123", "school.ivanova@gmail.com"));
		this.teachers.add(new Teacher("Mr. Georgiev", "georgiev123", "school.georgiev@gmail.com"));
	}
	
	private void SeedParents() {
		this.parents.add(new Parent("Ivan Ivanov", "qwerty1234", "ivan.ivanov@gmail.com"));
		this.parents.add(new Parent("Katrin Ivanova", "1234qwerty", "katrin.ivanov@gmail.com"));
		
		this.parents.add(new Parent("Stan Smith", "1234asdf", "stan.smith@gmail.com"));
		this.parents.add(new Parent("Angela Smith", "asdf1234", "angela.smith@gmail.com"));
	}

	
	public boolean IsDBEmpty() {
		boolean cEmpty = this.classes.isEmpty();
		boolean gEmpty = this.grades.isEmpty();
		boolean pEmpty = this.parents.isEmpty();
		boolean stEmpty = this.students.isEmpty();
		boolean suEmpty = this.subjects.isEmpty();
		boolean tEmpty = this.teachers.isEmpty();
		
		return cEmpty && gEmpty && pEmpty && stEmpty && suEmpty && tEmpty;
	}
	
	public List<Subject> getSubjectsDB() {
		return subjects;
	}

	public void setSubjectsDB(List<Subject> subjects) {
		this.subjects = subjects;
	}
	
	public List<Grade> getGradesDB() {
		return grades;
	}
	
	public void setGradesDB(List<Grade> grades) {
		this.grades = grades;
	}

	public List<Class> getClassesDB() {
		return classes;
	}
	
	public void setClassesDB(List<Class> classes) {
		this.classes = classes;
	}

	public List<Student> getStudentsDB() {
		return students;
	}
	
	public void setStudentsDB(List<Student> students) {
		this.students = students;
	}

	public List<Parent> getParentsDB() {
		return parents;
	}
	
	public void setParentsDB(List<Parent> parents) {
		this.parents = parents;
	}

	public List<Teacher> getTeachersDB() {
		return teachers;
	}
	
	public void setTeachersDB(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	
}
