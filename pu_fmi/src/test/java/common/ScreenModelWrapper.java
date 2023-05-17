package common;

import login.LoginScreenModel;
import register.RegisterScreenModel;
import addGrade.AddGradeScreen;
import addStudent.AddStudentScreen;
import scheduleExam.ScheduleExamScreen;
import updateGrade.UpdateGradeScreen;

public class ScreenModelWrapper {
	private LoginScreenModel loginScreenModel;
    private RegisterScreenModel registerScreenModel;
    private AddGradeScreen addGradeScreenModel;
    private AddStudentScreen addStudentScreenModel;
    private ScheduleExamScreen scheduleExamSceenModel;
    private UpdateGradeScreen updateGradeScreenModel;

    public LoginScreenModel getLoginScreenModel() {
        return loginScreenModel;
    }

    public void setLoginScreenModel(LoginScreenModel loginScreenModel) {
        this.loginScreenModel = loginScreenModel;
    }

    public RegisterScreenModel getRegisterScreenModel() {
        return registerScreenModel;
    }

    public void setRegisterScreenModel(RegisterScreenModel registerScreenModel) {
        this.registerScreenModel = registerScreenModel;
    }

	public AddGradeScreen getAddGradeScreenModel() {
		return addGradeScreenModel;
	}

	public void setAddGradeScreenModel(AddGradeScreen addGradeScreenModel) {
		this.addGradeScreenModel = addGradeScreenModel;
	}

	public AddStudentScreen getAddStudentScreenModel() {
		return addStudentScreenModel;
	}

	public void setAddStudentScreenModel(AddStudentScreen addStudentScreenModel) {
		this.addStudentScreenModel = addStudentScreenModel;
	}

	public ScheduleExamScreen getScheduleExamSceenModel() {
		return scheduleExamSceenModel;
	}

	public void setScheduleExamSceenModel(ScheduleExamScreen scheduleExamSceenModel) {
		this.scheduleExamSceenModel = scheduleExamSceenModel;
	}

	public UpdateGradeScreen getUpdateGradeScreenModel() {
		return updateGradeScreenModel;
	}

	public void setUpdateGradeScreenModel(UpdateGradeScreen updateGradeScreenModel) {
		this.updateGradeScreenModel = updateGradeScreenModel;
	}
	
	 public Object getActiveModel() {
			if (registerScreenModel != null ) {
				return registerScreenModel;
			}
			
			if (loginScreenModel != null ) {
				return loginScreenModel;
			}
			
			if (addGradeScreenModel != null ) {
				return addGradeScreenModel;
			}
			
			if (addStudentScreenModel != null ) {
				return addStudentScreenModel;
			}
			
			if (scheduleExamSceenModel != null ) {
				return scheduleExamSceenModel;
			}
			
			if (updateGradeScreenModel != null ) {
				return updateGradeScreenModel;
			}
			 
	        return null;
	    }
}

