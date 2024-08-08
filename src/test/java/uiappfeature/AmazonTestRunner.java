package uiappfeature;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features =  {"classpath:uiappfeature"},
		
		glue = {"uiappfeature"},
		
		plugin = {"pretty", "html:target/amazontestreport/reports.html",
				"json:target/cucumber-report.json"},
		
		publish = true,	
		
		tags = "@regression"
		
		
		
		)

public class AmazonTestRunner extends AbstractTestNGCucumberTests
{
	
	


}
