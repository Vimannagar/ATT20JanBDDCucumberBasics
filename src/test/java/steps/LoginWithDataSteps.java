package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithDataSteps {
	
	
	@Given("user is at loginpage")
	public void user_is_at_loginpage() {
	   System.out.println("Nav to login page");
	}

	@When("user enters the username as {string}")
	public void user_enters_the_username_as(String uname) {
	   System.out.println("Entering username :"+uname);
	}

	@When("user enters {string} as password")
	public void user_enters_as_password(String pwd) {
	    
		System.out.println("Entering password as :"+pwd);
	}

	@When("user click on login {int} button")
	public void user_click_on_login_button(Integer int1) {
	  System.out.println("Clicking on login button number :"+int1);  
	}


	@Then("user should be able to logged in")
	public void user_should_be_able_to_logged_in() {
	   System.out.println("Validating login functionality");
	}

}
