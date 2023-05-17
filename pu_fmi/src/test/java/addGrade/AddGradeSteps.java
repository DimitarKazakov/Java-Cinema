package addGrade;

import org.junit.Assert;

import common.ScreenModelWrapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddGradeSteps {
	private ScreenModelWrapper screenModelWrapper;

    public AddGradeSteps(){
        this.screenModelWrapper = new ScreenModelWrapper();
    }

    @Given("Отваряме екрана за нанасяне на оценка")
    public void openAddGradeScreen() {
        screenModelWrapper.setAddGradeScreenModel(new AddGradeScreen());
    }
    @When("Въведем име: {string}, във формата за нанасяне на оценка")
    public void addUsername(String name) {
        ((AddGradeScreen)screenModelWrapper.getActiveModel()).addStudentName(name);
    }
    @And("Въведем оценка: {int}, във формата за нанасяне на оценка")
    public void addPasswordAnd(int grade) {
    	((AddGradeScreen)screenModelWrapper.getActiveModel()).addGrade(grade);
    }
    
    @And("Въведем предмет: {string}, във формата за нанасяне на оценка")
    public void addEmail(String subject) {
    	((AddGradeScreen)screenModelWrapper.getActiveModel()).addSubject(subject);
    }
    @And("Натиснем бутона за запазване на оценка")
    public void clickSaveButton() {
    	((AddGradeScreen)screenModelWrapper.getActiveModel()).clickAddButton();
    }
    @Then("Виждаме съобщение: {string}, от формата за нанасяне на оценка")
    public void checkMessage(String expectedMessage) {
       Assert.assertEquals(expectedMessage,
    		   ((AddGradeScreen)screenModelWrapper.getActiveModel()).getNotification());
    }
}
