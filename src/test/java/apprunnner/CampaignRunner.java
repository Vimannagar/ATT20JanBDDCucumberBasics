package apprunnner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeatures\\Campaigns.feature"},
		
		glue = {"steps", "hooks"},
		
		publish = true,
		
		plugin = {"pretty"},
		
		tags = "@campaigns",
		
		dryRun = true
		
		
		)



public class CampaignRunner extends AbstractTestNGCucumberTests

{

}
