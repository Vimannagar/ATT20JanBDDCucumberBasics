package apprunnner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeatures\\Orders.feature"},
		glue = {"steps"},
		publish = true
				
		)



public class OrderRunner extends AbstractTestNGCucumberTests {

}
