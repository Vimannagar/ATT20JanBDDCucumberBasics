package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;
	WebDriverWait wait;

	@FindBy(xpath = "//*[@id='nav-cart123']")
	private WebElement cart_icon;

	@FindAll(
			{
	@FindBy(xpath = "//*[@class='a-carousel-card']//a[@aria-label='Grocery']"),
	
	@FindBy(xpath = "//li[@class='a-carousel-card']//img[@alt='Super Value days']")
				}
		   )
	private WebElement dailyneedsCarousel;

	@FindBy(xpath = "//*[@id='nav-link-accountList']")
	private WebElement signInHoverElement;

	@FindBy(xpath = "//*[@id='nav-flyout-ya-signin']//a[@class='nav-action-signin-button']")
	private WebElement signInButton;

	@FindBy(xpath = "//*[@id='ap_email']")
	private WebElement emailText;

	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continueButton;

	@FindBy(xpath = "//input[@id='ap_password']")
	private WebElement passwordField;

	@FindBy(xpath = "//input[@id='signInSubmit123']")
	private WebElement finalSignIn;
	
	@FindBy(xpath = "//*[@id='nav-subnav']//*[normalize-space(text())='Grocery & Gourmet Foods']")
	private WebElement health;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}

	public String fetchingTitleOfPage() {
		String titleOfPage = driver.getTitle();

		return titleOfPage;
	}

	public Boolean ifCartIconDisplayed() {
		boolean isGettingDisplayed = cart_icon.isDisplayed();

		return isGettingDisplayed;
	}

	public void enteringDailyNeedsSection() {
		wait.until(ExpectedConditions.visibilityOf(dailyneedsCarousel));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", dailyneedsCarousel);
		
		wait.until(ExpectedConditions.visibilityOf(health));
	System.out.println(health.isDisplayed());	

//		dailyneedsCarousel.click();
	}

	public void goToSignIn() {
		Actions act = new Actions(driver);

		act.moveToElement(signInHoverElement).perform();

		signInButton.click();

	}

	public void enteringUsername(String uname) {
		emailText.sendKeys(uname);
		continueButton.click();
	}

	public void finalLogin(String pwd) {
		passwordField.sendKeys(pwd);

		finalSignIn.click();
	}

}