package uiappfeature;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\uiappfeature\\Homepage.feature"},
		
		glue = {"uiappfeature"},
		
		plugin = {
				"pretty",
				"html:target/amazontestreport/reports.html", 
				"rerun:target/failedrun.txt"
		},
		
		publish = true,	
		
		tags = "@sanity or @regression"
		
		)




public class AmazonFailedTestRunner  extends AbstractTestNGCucumberTests
{

}
