package uiappfeature;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import qa.DriverFactory;
import utility.PropertyReader;

public class AppHooks {

	WebDriver driver;
	@Before
	public void launchBrowser() throws IOException {
		
		PropertyReader pr = new PropertyReader();
		
		String browserName = pr.readPropData("browser");
		
		DriverFactory df = new DriverFactory();

		driver = df.initBrowser(browserName);

		driver.manage().window().maximize();

	}

	
	@After(order = 2)
	public void tearDown(Scenario scenario)
	{
		boolean scenarioStatus = scenario.isFailed();
		
		if(scenarioStatus)
		{
			String scenarioName = scenario.getName();
			
			String nameOfScenario = scenarioName.replace(" ", "_");
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			
			byte[] source = ts.getScreenshotAs(OutputType.BYTES);
			
			scenario.attach(source, "image/png", nameOfScenario);
		}
		
		
	}
	
	@After(order = 1)
	public void closeBrowser()
	{
		driver.quit();
	}
	
}
