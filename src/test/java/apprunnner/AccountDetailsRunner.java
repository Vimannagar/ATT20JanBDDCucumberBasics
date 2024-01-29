package apprunnner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeatures\\Accountdetails.feature"},
		
		glue = {"steps"},
		
		publish = true,
		
		plugin = {"pretty"}
		
		
		)



public class AccountDetailsRunner extends AbstractTestNGCucumberTests
{

}
