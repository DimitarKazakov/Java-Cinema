package com.rest.app.rest.Services;

import com.rest.app.rest.Models.Student;
import com.rest.app.rest.Models.Subject;

import java.util.List;
import java.util.ArrayList;

import com.rest.app.rest.DB;
import com.rest.app.rest.Models.Class;

public class ClassService {
	
	//DONE
	public String AddStudentToClass(DB context, String schoolClass, String student) {
		if(student == "") {
			return "Не сте въвели ученик";
		}
		
		List<Student> students = context.getStudentsDB().stream().filter(x -> x.getName() == student).toList();
		if(students.isEmpty()) {
			return "Няма такъв ученик";
		}
		
		var stu = students.get(0);
		
		if(schoolClass == "") {
			return "Не сте въвели клас";
		}
		
		List<Class> classes = context.getClassesDB().stream()
				.filter(x -> x.getNumber().equals(schoolClass)).toList();
		
		if(classes.isEmpty()) {
			return "Няма такъв клас";
		}
		
		var cls = classes.get(0);
		
		var clStudents = cls.getStudents();
		clStudents.add(stu);
		cls.setStudents(clStudents);
		
		return "Успешно добавихте ученика към класа";
	}
	
	
	//DONE
	public String ChangeSchoolProgram(DB context, String schoolClass, List<String> subjects) {
		if(schoolClass == "") {
			return "Не сте въвели клас";
		}
		
		List<Class> classes = context.getClassesDB().stream()
				.filter(x -> x.getNumber().equals(schoolClass)).toList();
		
		if(classes.isEmpty()) {
			return "Няма такъв клас";
		}
		
		var scClass = classes.get(0);
		ArrayList<Subject> scSubj = new ArrayList<Subject>();
		for (String subj : subjects) 
		{ 
			List<Subject> subjectTemp = context.getSubjectsDB().stream()
					.filter(x -> x.getName().equals(subj)).toList();
			if(subjectTemp.isEmpty()) {
				return "Няма такъвива предмети";
			}
			
			scSubj.add(subjectTemp.get(0));
		}
		
		scClass.setSubjects(scSubj);
		return "Успешно редактирахте учебната програма";
	}
	
	//DONE
	public String GetSchoolProgram(DB context, String schoolClass) {
		if(schoolClass == "") {
			return "Не сте въвели клас";
		}
		
		List<Class> classes = context.getClassesDB().stream()
				.filter(x -> x.getNumber().equals(schoolClass)).toList();
		
		if(classes.isEmpty()) {
			return "Няма такъв клас";
		}
		
		var scClass = classes.get(0);
		return "Заповядайте програмата за " + schoolClass  + " клас";
	}
}
