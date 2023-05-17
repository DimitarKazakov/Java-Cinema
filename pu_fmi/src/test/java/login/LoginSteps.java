package login;

import org.junit.Assert;

import common.ScreenModelWrapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class LoginSteps {
	private ScreenModelWrapper screenModelWrapper;

    public LoginSteps(){
        this.screenModelWrapper = new ScreenModelWrapper();
    }

    @Given("Отваряме екрана за вход в системата")
    public void openLoginScreen() {
        screenModelWrapper.setLoginScreenModel(new LoginScreenModel());
    }
    @When("Въведем име: {string}")
    public void addUsername(String username) {
        ((LoginScreenModel)screenModelWrapper.getActiveModel()).addUsername(username);
    }
    @And("Въведем парола: {string}")
    public void addPasswordAnd(String pass) {
    	((LoginScreenModel)screenModelWrapper.getActiveModel()).addPassword(pass);
    }
    
    @And("Въведем имейл: {string}")
    public void addEmail(String email) {
    	((LoginScreenModel)screenModelWrapper.getActiveModel()).addEmail(email);
    }
    @And("Натиснем бутона за вход")
    public void clickLoginButton() {
    	((LoginScreenModel)screenModelWrapper.getLoginScreenModel()).clickLoginButton();
    }
    @Then("Виждаме съобщение: {string}")
    public void checkMessage(String expectedMessage) {
       Assert.assertEquals(expectedMessage,
    		   ((LoginScreenModel)screenModelWrapper.getActiveModel()).getMessage());
    }
}
