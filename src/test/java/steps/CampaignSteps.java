package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

	public class CampaignSteps {
		
		@Given("user is at campaigns page")
		public void user_is_at_campaigns_page() {
		    System.out.println("Given statement");
		}
	
		@When("user click on create campaign button")
		public void user_click_on_create_campaign_button() {
		   System.out.println("Clicking on campaign button");
		}
	
		@When("user enters the information")
		public void user_enters_the_information() {
		    System.out.println("Entered the information");
		}
	
		@When("user click on save button")
		public void user_click_on_save_button() {
		   System.out.println("Clicking on save button");
		}
	
		@Then("Campaign should get created")
		public void campaign_should_get_created() {
		    System.out.println("Validating campaign creation");
		}
	
		@When("user click on edit campaign")
		public void user_click_on_edit_campaign() {
		    System.out.println("Clicked on edit button");
		}
	
		@When("user enters the time")
		public void user_enters_the_time() {
		    System.out.println("Entering the time");
		}
	
		@Then("campaign should get scheduled")
		public void campaign_should_get_scheduled() {
		    System.out.println("Validating the schedule of campaign");
		}
	
		@When("user click on send campaign")
		public void user_click_on_send_campaign() {
		   System.out.println("Clicked on send");
		}
	
		@Then("campaign should get sent to contacts")
		public void campaign_should_get_sent_to_contacts() {
		   System.out.println("Validate the count it got sent");
		}
	
	
	}
