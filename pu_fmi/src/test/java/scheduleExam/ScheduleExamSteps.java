package scheduleExam;

import org.junit.Assert;

import common.ScreenModelWrapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScheduleExamSteps {
	private ScreenModelWrapper screenModelWrapper;

    public ScheduleExamSteps(){
        this.screenModelWrapper = new ScreenModelWrapper();
    }

    @Given("Отваряме екрана за провеждане на контролно изпитване")
    public void openAddGradeScreen() {
        screenModelWrapper.setScheduleExamSceenModel(new ScheduleExamScreen());
    }
    @When("Въведем клас: {string}, във формата за провеждане на контролно изпитване")
    public void addUsername(String classs) {
        ((ScheduleExamScreen)screenModelWrapper.getActiveModel()).addClass(classs);
    }
    @And("Въведем предмет: {string}, във формата за провеждане на контролно изпитване")
    public void addPasswordAnd(String subject) {
    	((ScheduleExamScreen)screenModelWrapper.getActiveModel()).addSubject(subject);
    }
    @And("Натиснем бутона за запазване на изпит, във формата за провеждане на контролно изпитване")
    public void clickSaveButton() {
    	((ScheduleExamScreen)screenModelWrapper.getActiveModel()).clickAddButton();
    }
    @Then("Виждаме съобщение: {string}, от формата за провеждане на контролно изпитване")
    public void checkMessage(String expectedMessage) {
       Assert.assertEquals(expectedMessage,
    		   ((ScheduleExamScreen)screenModelWrapper.getActiveModel()).getNotification());
    }
}
