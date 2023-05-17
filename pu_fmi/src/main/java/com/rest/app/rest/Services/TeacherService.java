package com.rest.app.rest.Services;

import java.util.List;

import com.rest.app.rest.DB;
import com.rest.app.rest.Models.Class;
import com.rest.app.rest.Models.Subject;

public class TeacherService {
	//DONE
	public String ScheduleExam(DB context, String schoolClass, String subject) {
		if(schoolClass == "") {
			return "Не сте въвели клас";
		}
		
		if(subject == "") {
			return "Не сте въвели предмет";
		}
		
		List<Class> classes = context.getClassesDB().stream()
				.filter(x -> x.getNumber().equals(schoolClass)).toList();
		
		if(classes.isEmpty()) {
			return "Няма такъв клас";
		}
		
		List<Subject> subjectTemp = context.getSubjectsDB().stream()
				.filter(x -> x.getName().equals(subject)).toList();
		
		if(subjectTemp.isEmpty()) {
			return "Няма такъвива предмети";
		}
		
		var cls = classes.get(0);
		var subj = subjectTemp.get(0);
		
		
		return "Успешно насрочихте контролно по " + subject + " за клас " + schoolClass;
	}
	
	//DONE
	public String ViewUpcomingExams(DB context, String schoolClass) {
		if(schoolClass == "") {
			return "Не сте въвели клас";
		}
		
		List<Class> classes = context.getClassesDB().stream()
				.filter(x -> x.getNumber().equals(schoolClass)).toList();
		
		if(classes.isEmpty()) {
			return "Няма такъв клас";
		}
		
		
		var cls = classes.get(0);
		
		
		return "Заповядайте предстоящите изпити за " + schoolClass + " клас ";
	}
}
