package uiappfeature;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import qa.DriverFactory;

public class HomePageSteps {
	
	  HomePage homepage = new HomePage(DriverFactory.getDriver());
	  
	@Given("I am at landing page")
	public void i_am_at_landing_page() throws InterruptedException {
	   
	  WebDriver driver = DriverFactory.getDriver();
	
	  driver.get("https://www.amazon.in/");
	  
	  Thread.sleep(2000);
	  
	  driver.navigate().refresh();
	  
	  
	}

	@Then("page title should have {string}")
	public void page_title_should_have(String word) {
	    
		String actualTitle = homepage.fetchingTitleOfPage();
		
		boolean isPresent = actualTitle.contains(word);
		
		Assert.assertTrue(isPresent);
		
		
	}

	@Then("cart icon should get display")
	public void cart_icon_should_get_display() {
	    
		Boolean isDisplaying = homepage.ifCartIconDisplayed();
		
		Assert.assertEquals(isDisplaying, true);		
		
	}

	@When("I see the daily needs then I click on it")
	public void i_see_the_daily_needs_then_i_click_on_it() {
	    homepage.enteringDailyNeedsSection();
	}

	@When("I click on signin button")
	public void i_click_on_signin_button() {
	    homepage.goToSignIn();
	    
	}

	@When("I enter the username as {string}")
	public void i_enter_the_username_as(String username) {
	   homepage.enteringUsername(username);
	}
	
	@When("I enter the password as {string} with final signin")
	public void i_enter_the_password_as_with_final_signin(String pwd) {
	    
		homepage.finalLogin(pwd);
	}

	

}
