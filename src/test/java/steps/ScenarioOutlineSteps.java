package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {
	
	@Given("user is at signup page")
	public void user_is_at_signup_page() {
	   System.out.println("Navigating to signup page");
	}

	@When("user enters {string} inside the form")
	public void user_enters_inside_the_form(String name) {
	   System.out.println("Entered name is "+name);
	}

	@When("user enters age as {int}")
	public void user_enters_age_as(Integer age) {
	    System.out.println("Entering age as :"+age);
	
	}

	@When("user confirms the {string} by checkbox")
	public void user_confirms_the_by_checkbox(String gender) {
	    System.out.println("Selecting the gender as "+gender);
	}

	@Then("user account gets created")
	public void user_account_gets_created() {
	   System.out.println("Validating account information");
	}

}
