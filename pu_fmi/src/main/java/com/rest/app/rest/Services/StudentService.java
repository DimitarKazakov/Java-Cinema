package com.rest.app.rest.Services;

import java.util.List;

import com.rest.app.rest.DB;
import com.rest.app.rest.Models.Grade;
import com.rest.app.rest.Models.Student;
import com.rest.app.rest.Models.Subject;

public class StudentService {
	//DONE
	public String ViewStudentGrades(DB context, String studentName) {
		if(studentName == "") {
			return "Не сте въвели ученик";
		}
		
		List<Student> students = context.getStudentsDB().stream().filter(x -> x.getName() == studentName).toList();
		if(students.isEmpty()) {
			return "Няма такъв ученик";
		}
		
		var stu = students.get(0);
		return "Заповядайте оценките за ученик: " + studentName;
	}
	
	//DONE
	public String AddGrade(DB context, String studentName, int grade, String subject) {
		if(studentName == "") {
			return "Не сте въвели ученик";
		}
		
		List<Student> students = context.getStudentsDB().stream().filter(x -> x.getName() == studentName).toList();
		if(students.isEmpty()) {
			return "Няма такъв ученик";
		}
		
		if(grade < 2) {
			return "Минималната оценка е 2";
		}
		
		if(grade > 6) {
			return "Максималната оценка е 6";
		}
		
		if(subject == "") {
			return "Не сте въвели предмет";
		}
		
		List<Subject> subjectTemp = context.getSubjectsDB().stream()
				.filter(x -> x.getName().equals(subject)).toList();
		if(subjectTemp.isEmpty()) {
			return "Няма такъвива предмети";
		}
		
		var stu = students.get(0);
		var subj = subjectTemp.get(0);
		
		var grades = stu.getGrades();
		grades.add(new Grade(grade, subj, ""));
		stu.setGrades(grades);
		
		return "Успещно добавихте оценката на ученика " + studentName + " за предмета " + subject;
	}
	
	//DONE
	public String UpdateGrade(DB context, String studentName, int grade, String subject) {
		if(studentName == "") {
			return "Не сте въвели ученик";
		}
		
		List<Student> students = context.getStudentsDB().stream().filter(x -> x.getName() == studentName).toList();
		if(students.isEmpty()) {
			return "Няма такъв ученик";
		}
		
		if(grade < 2) {
			return "Минималната оценка е 2";
		}
		
		if(grade > 6) {
			return "Максималната оценка е 6";
		}
		
		if(subject == "") {
			return "Не сте въвели предмет";
		}
		
		List<Subject> subjectTemp = context.getSubjectsDB().stream()
				.filter(x -> x.getName().equals(subject)).toList();
		if(subjectTemp.isEmpty()) {
			return "Няма такъв предмет";
		}
		
		var stu = students.get(0);
		var grades = stu.getGrades().stream().filter(x -> x.getSubject().getName() == subject).toList();
		if(grades.isEmpty()) {
			return "Ученика няма оценка по този предмет";
		}
		
		grades.get(0).setScore(grade);
		
		return "Успещно редактирахте оценката на ученика " + studentName + " по предмета " + subject;
	}
}
