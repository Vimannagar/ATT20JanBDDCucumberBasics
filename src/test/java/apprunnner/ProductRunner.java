package apprunnner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeatures\\PlaceOrder.feature"},
		
		glue = {"steps"},
		
		publish = true,
		
		dryRun = true
		
		)

public class ProductRunner extends AbstractTestNGCucumberTests
{

}
