package uiappfeature;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	
	public Test(WebDriver driver)
	{
		System.out.println("Constructor is executing");
		
		driver.get("https://www.google.com");
	}	
	
	
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		
		Test t = new Test(driver);
	}
	
	
	

}
