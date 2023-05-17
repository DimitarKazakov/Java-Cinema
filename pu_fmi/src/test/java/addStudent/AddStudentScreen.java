package addStudent;

import com.rest.app.rest.DB;
import com.rest.app.rest.Services.ClassService;

public class AddStudentScreen {
	private DB context = new DB();
	private String studentName = "";
	private String schoolClass = "";
	private String notification = "";
	
	public void addStudentName(String stName) {
		this.studentName = stName;
	}
	
	public void addClass(String scClass) {
		this.schoolClass = scClass;
	}
	
	public void setNotification(String msg) {
		this.notification = msg;
	}
	
	public String getStudentName() {
		return this.studentName;
	}
	
	public String getSchoolClass() {
		return this.schoolClass;
	}
	
	public String getNotification() {
		return this.notification;
	}
	
	
	public void clickAddButton() {
		ClassService service = new ClassService();
		this.notification = service.AddStudentToClass(context, schoolClass, studentName);
	}
}
