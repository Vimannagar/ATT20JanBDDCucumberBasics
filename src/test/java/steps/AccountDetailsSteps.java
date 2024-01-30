package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;

public class AccountDetailsSteps {

	@Given("user should be at account opening page")
	public void user_should_be_at_account_opening_page() {

		System.out.println("Given statement");
	}

	@When("user enters the following data")
	public void user_enters_the_following_data(DataTable dataTable) {

		List<List<String>> data = dataTable.asLists();

		List<String> firstList = data.get(0);

		System.out.println(firstList);// zeroth index position's list 
		
		String firstIndexPositionData = firstList.get(1);
		
		System.out.println(firstIndexPositionData);
		
		System.out.println("*************************************************");
		
		String value =  data.get(1).get(3);
		
		System.out.println(value);//9977665544
		
		System.out.println("***************************************************");
		
//		Reading the data using map
		
		List<Map<String, String>> data1 = dataTable.asMaps();
		
		String emailValue = data1.get(1).get("email");
		
		System.out.println(emailValue);//rob.gilto@gmail.com
		
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {

		System.out.println("Clicking on submit button");
	}

	@Then("user account get created")
	public void user_account_get_created() {

		System.out.println("Validation of account");
	}

}
