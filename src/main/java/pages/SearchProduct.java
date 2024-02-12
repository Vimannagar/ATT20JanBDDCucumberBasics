package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchProduct {
	WebDriver driver;
	WebDriverWait wait;

	@FindBy(xpath = "//*[@id='twotabsearchtextbox']")
	private WebElement searchField;

	
	@FindBy(xpath = "//*[@id='nav-search-submit-button']")
	private WebElement searchButton;

	
	@FindBy(xpath = "//*[contains(text(),'Samsung Galaxy M14 5G')]/parent::a")
	private WebElement productname;
	
	
	public SearchProduct(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	public void enterItems(String name)
	{
		searchField.sendKeys(name);
		searchButton.click();
		
	}
	
	public boolean getProductInfo()
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		boolean isDisplaying = productname.isDisplayed();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", productname);
//		productname.click();
		
		return isDisplaying;
	}
	
	
	
	
	
	
	
}
