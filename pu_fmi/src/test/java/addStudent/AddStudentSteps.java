package addStudent;

import org.junit.Assert;

import common.ScreenModelWrapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddStudentSteps {
	private ScreenModelWrapper screenModelWrapper;

    public AddStudentSteps(){
        this.screenModelWrapper = new ScreenModelWrapper();
    }

    @Given("Отваряме екрана за добавяне на ученик")
    public void openAddGradeScreen() {
        screenModelWrapper.setAddStudentScreenModel(new AddStudentScreen());
    }
    @When("Въведем клас: {string}, във формата за добавяне на ученик")
    public void addUsername(String classs) {
        ((AddStudentScreen)screenModelWrapper.getActiveModel()).addClass(classs);
    }
    @And("Въведем ученик: {string}, във формата за добавяне на ученик")
    public void addPasswordAnd(String name) {
    	((AddStudentScreen)screenModelWrapper.getActiveModel()).addStudentName(name);
    }
    
    @And("Натиснем бутона за запазване, във формата за добавяне на ученик")
    public void clickSaveButton() {
    	((AddStudentScreen)screenModelWrapper.getActiveModel()).clickAddButton();
    }
    @Then("Виждаме съобщение: {string}, от формата за добавяне на ученик")
    public void checkMessage(String expectedMessage) {
       Assert.assertEquals(expectedMessage,
    		   ((AddStudentScreen)screenModelWrapper.getActiveModel()).getNotification());
    }
}
