package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderSteps {
	
	// CTRL + SHIFT + O -  To import the unimported content from class
@Given("user should be logged into the app")
public void user_should_be_logged_into_the_app() {
   System.out.println("User logged into app");
}

@When("user clicks on order button")
public void user_clicks_on_order_button() {
    System.out.println("Clicking on order button");
}

@When("User clicks on past order button")
public void user_clicks_on_past_order_button() {
	System.out.println("Clicking on past order button");
	throw new ArithmeticException();
} 

@Then("user should be able to see past order information")
public void user_should_be_able_to_see_past_order_information() {
	System.out.println("Validate past order information");
}

@When("user clicks on current order button")
public void user_clicks_on_current_order_button() {
	System.out.println("Clicking on current order button");
}

@Then("user should be able to see the current order information")
public void user_should_be_able_to_see_the_current_order_information() {
	System.out.println("Validate current order information");
}

@When("user clicks on cancelled order button")
public void user_clicks_on_cancelled_order_button() {
	System.out.println("Clicking on cancelled order button");
	
}

@Then("user should be able to see the cancelled order information")
public void user_should_be_able_to_see_the_cancelled_order_information() {
	System.out.println("Validate cancelled order information");
}

}
