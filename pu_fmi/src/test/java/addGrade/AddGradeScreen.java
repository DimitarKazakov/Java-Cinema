package addGrade;

import com.rest.app.rest.DB;
import com.rest.app.rest.Services.StudentService;

public class AddGradeScreen {
	private DB context = new DB();
	private String studentName = "";
	private int grade = 0;
	private String subject = "";
	private String notification = "";
	
	public void addStudentName(String stName) {
		this.studentName = stName;
	}
	
	public void addGrade(int grade) {
		this.grade = grade;
	}
	
	public void addSubject(String subject) {
		this.subject = subject;
	}
	
	public void setNotification(String msg) {
		this.notification = msg;
	}
	
	public String getStudentName() {
		return this.studentName;
	}
	
	public String getSubject() {
		return this.subject;
	}
	
	public String getNotification() {
		return this.notification;
	}
	
	public int getGrade() {
		return this.grade;
	}
	
	public void clickAddButton() {
		StudentService service = new StudentService();
		this.notification = service.AddGrade(context, studentName, grade, subject);
	}
}
