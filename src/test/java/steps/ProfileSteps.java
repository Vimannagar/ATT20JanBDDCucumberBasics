package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSteps {
	
	@Given("I am at home page")
	public void i_am_at_home_page() {
	    System.out.println("Given statement");
	}

	@When("I click on add button")
	public void i_click_on_add_button() {
	   System.out.println("Clicking on add button");
	}

	@When("I enter the data")
	public void i_enter_the_data() {
	    System.out.println("Entering the data");
	}

	@Then("profile should get added")
	public void profile_should_get_added() {
	  System.out.println("Validating the profile addition");
	}

	@When("I click on edit button")
	public void i_click_on_edit_button() {
	    System.out.println("Clicking on edit button");
	}

	@When("I update the data")
	public void i_update_the_data() {
	   System.out.println("Updating the data");
	}

	@Then("Profile should get updated")
	public void profile_should_get_updated() {
	   System.out.println("Validating the updation");
	}

	@When("I click on delete button")
	public void i_click_on_delete_button() {
	    System.out.println("Clicking on delete button");
	}

	@Then("Profile should get deleted")
	public void profile_should_get_deleted() {
	    System.out.println("Validating deletion of profile");
	}


}
