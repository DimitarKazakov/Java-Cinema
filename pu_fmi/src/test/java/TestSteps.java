import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps {

		@Given("user in on login page")
		public void user_in_on_login_page() {
		    System.out.print("Inside step - given");
		}

		@When("users enters username and password")
		public void users_enters_username_and_password() {
			System.out.print("Inside step - when");
		}

		@And("clicks on login button")
		public void clicks_on_login_button() {
			System.out.print("Inside step - and");
		}

		@Then("user is navigated to the home page")
		public void user_is_navigated_to_the_home_page() {
			System.out.print("Inside step - then");
		}
}
