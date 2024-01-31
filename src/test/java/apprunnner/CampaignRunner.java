package apprunnner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeatures\\Campaigns.feature"},
		
		glue = {"steps"},
		
		publish = true,
		
		plugin = {"pretty"},
		
		tags = "@regression"
		
		
		)



public class CampaignRunner extends AbstractTestNGCucumberTests

{

}
