package com.rest.app.rest.Services;

import com.rest.app.rest.DB;
import com.rest.app.rest.Models.Parent;
import com.rest.app.rest.Models.Student;
import com.rest.app.rest.Models.Teacher;

public class UserService {
	//DONE
	public String Login(DB context, String username, String password, String email) {
		if (username == "") {
            return "Не сте въвели име";
        }
		
		if (password == "") {
            return "Не сте въвели парола";
        }
		
		if (email == "") {
            return "Не сте въвели имейл";
        }
		
		boolean parentExists = context.getParentsDB().stream()
				.anyMatch(user -> user.getName() == username && user.getPassword() == (password) && user.getEmail() == (email));
		
		if(parentExists) {
			return "Здравейте родител, вие влязохте в системата";
		}
		
		boolean teacherExists = context.getTeachersDB().stream()
				.anyMatch(user -> user.getName() == (username) && user.getPassword() == (password) && user.getEmail() == (email));
		
		if(teacherExists) {
			return "Здравейте учител, вие влязохте в системата";
		}
		
		boolean studentsExists= context.getStudentsDB().stream()
				.anyMatch(user -> user.getName() == (username) && user.getPassword() == (password) && user.getEmail() == (email));
		
		if(studentsExists) {
			return "Здравейте ученик, вие влязохте в системата";
		}
		
		return "Грешни данни";
	}
	
	//DONE
	public String Register(DB context, String username, String password, String secondPassword, String email, String role) {
		if (username == "") {
            return "Не сте въвели име";
        }
		
		if (password == "" || password.length() < 6 || password.length() > 30) {
			return "Невалидна парола";
		}
		
		if (password != secondPassword) {
			return "Двете пароли не съвпадат";
		}
		
		boolean isUsernameExistsS = context.getStudentsDB().stream()
                .anyMatch(u -> u.getName().equals(username));
		boolean isUsernameExistsP = context.getTeachersDB().stream()
                .anyMatch(u -> u.getName().equals(username));
		boolean isUsernameExistsT = context.getParentsDB().stream()
                .anyMatch(u -> u.getName().equals(username));
		
		if(isUsernameExistsS || isUsernameExistsP || isUsernameExistsT) {
			return "Името е заето";
		}
		
		switch(role) {
			case "Teacher":
				var users = context.getTeachersDB();
				users.add(new Teacher(username, password, email));
				context.setTeachersDB(users);
				break;
			case "Students":
				var students = context.getStudentsDB();
				students.add(new Student(username, password, email));
				context.setStudentsDB(students);
				break;
			case "Parent":
				var parents = context.getParentsDB();
				parents.add(new Parent(username, password, email));
				context.setParentsDB(parents);
				break;
			default:
				return "Съжалявам възниква грешка при регистрацията";
		}
		
		return "Успешно се регистрирахте";
	}
}
