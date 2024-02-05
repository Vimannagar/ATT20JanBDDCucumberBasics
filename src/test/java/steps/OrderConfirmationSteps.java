package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderConfirmationSteps {
	
	PlaceOrder placeOrder;
	
	static String prdId;
	
	
	public OrderConfirmationSteps(PlaceOrder placeOrder)
	{
		this.placeOrder = placeOrder;
	}
	
	@When("I click on place order button")
	public void i_click_on_place_order_button() {
	   System.out.println("Clicking on place order button");
	}

	@Then("Order should get confirmed")
	public void order_should_get_confirmed() {
		
		 prdId = placeOrder.getProductId();
		
	   System.out.println("Order get confirmed with the product id " + prdId);
	}
	
	
	@When("I placed the order")
	public void placeOrder()
	{
		System.out.println("Placing the order");
	}
	
	@Then("I should be able to validate the order status")
	public void validateStatusWithProductID()
	{
		System.out.println("Product ID received in scenario 2 is "+prdId);
	}

}
