package scheduleExam;

import com.rest.app.rest.DB;
import com.rest.app.rest.Services.TeacherService;

public class ScheduleExamScreen {
	private DB context = new DB();
	private String subject = "";
	private String schoolClass = "";
	private String notification = "";
	
	public void addSubject(String subject) {
		this.subject = subject;
	}
	
	public void addClass(String scClass) {
		this.schoolClass = scClass;
	}
	
	public void setNotification(String msg) {
		this.notification = msg;
	}
	
	public String getSubject() {
		return this.subject;
	}
	
	public String getSchoolClass() {
		return this.schoolClass;
	}
	
	public String getNotification() {
		return this.notification;
	}
	
	
	public void clickAddButton() {
		TeacherService service = new TeacherService();
		this.notification = service.ScheduleExam(context, schoolClass, subject);
	}
}
