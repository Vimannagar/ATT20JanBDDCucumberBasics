package uiappfeature;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchProduct;
import qa.DriverFactory;

public class SearchProductSteps {
	
	SearchProduct product = new SearchProduct(DriverFactory.getDriver());
	
	@When("I search the name as {string} in searchfield")
	public void i_search_the_name_as_in_searchfield(String string) {
	    product.enterItems(string);
	}

	@Then("I should get results")
	public void i_should_get_results() {
	    
		boolean isDisplaying = product.getProductInfo();
		
		Assert.assertTrue(isDisplaying);
	}

}
