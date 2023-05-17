package updateGrade;

import org.junit.Assert;

import common.ScreenModelWrapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UpdateGradeSteps {
	private ScreenModelWrapper screenModelWrapper;

    public UpdateGradeSteps(){
        this.screenModelWrapper = new ScreenModelWrapper();
    }

    @Given("Отваряме екрана за редактиране на оценка")
    public void openAddGradeScreen() {
        screenModelWrapper.setUpdateGradeScreenModel(new UpdateGradeScreen());
    }
    @When("Въведем име: {string}, във формата за редактиране на оценка")
    public void addUsername(String name) {
        ((UpdateGradeScreen)screenModelWrapper.getActiveModel()).addStudentName(name);
    }
    @And("Въведем оценка: {int}, във формата за редактиране на оценка")
    public void addPasswordAnd(int grade) {
    	((UpdateGradeScreen)screenModelWrapper.getActiveModel()).addGrade(grade);
    }
    
    @And("Въведем предмет: {string}, във формата за редактиране на оценка")
    public void addEmail(String subject) {
    	((UpdateGradeScreen)screenModelWrapper.getActiveModel()).addSubject(subject);
    }
    @And("Натиснем бутона за редакция, във формата за редактиране на оценка")
    public void clickSaveButton() {
    	((UpdateGradeScreen)screenModelWrapper.getActiveModel()).clickUpdateButton();
    }
    @Then("Виждаме съобщение: {string}, от формата за редактиране на оценка")
    public void checkMessage(String expectedMessage) {
       Assert.assertEquals(expectedMessage,
    		   ((UpdateGradeScreen)screenModelWrapper.getActiveModel()).getNotification());
    }
}
