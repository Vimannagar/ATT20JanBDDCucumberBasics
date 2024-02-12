package uiappfeature;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\uiappfeature"},
		
		glue = {"uiappfeature"},
		
		plugin = {"pretty", "html:target/amazontestreport/reports.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		
		publish = true,	
		
		tags = "@regression"
		
		
		
		)

public class AmazonTestRunner extends AbstractTestNGCucumberTests
{
	
	


}
