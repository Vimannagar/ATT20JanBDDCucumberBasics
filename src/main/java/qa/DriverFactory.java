package qa;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverFactory {
	static WebDriver driver;
	Capabilities capabilities;
	
	public WebDriver initBrowser(String browserName) throws MalformedURLException
	{
		if(browserName.equals("Chrome"))
		{
		capabilities = new ChromeOptions();
		}
		else if(browserName.equals("firefox"))
		{
			capabilities = new FirefoxOptions();
		}
		
		driver = new RemoteWebDriver(new URL("http://192.168.1.4:4444/wd/hub"), capabilities);
		
		return driver;
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}

}
