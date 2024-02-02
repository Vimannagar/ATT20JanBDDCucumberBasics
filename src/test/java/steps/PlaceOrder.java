package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlaceOrder {

private	String productId;
	
	public String getProductId()
	{
		return productId;
	}
	
	@Given("I should be at the product page")
	public void i_should_be_at_the_product_page() {
	    System.out.println("Given statement");
	}

	@When("I click on the add to cart button")
	public void i_click_on_the_add_to_cart_button() {
	  System.out.println("clicking on add to cart");
	}

	@Then("Product should get added")
	public void product_should_get_added() {
	   System.out.println("Product got added and id get generated");
	   
	    productId = "sdjsadaj3ksf32js";
	}

	

}
