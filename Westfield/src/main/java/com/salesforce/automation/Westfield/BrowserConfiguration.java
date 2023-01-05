package com.salesforce.automation.Westfield;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import io.testproject.sdk.drivers.web.ChromeDriver;

public class BrowserConfiguration {
	
public static ChromeDriver driver;
	
	
	@BeforeTest
	//@Parameters({"browser"})
	public void browserSetup() throws Exception 
	{
		
		driver = new ChromeDriver("2xW7DgT91IA2vmpo0xZpFLTC6dElC2Mf-w-xjSw-xtM1", new ChromeOptions());
		driver.navigate().to("https://westfield--uat.sandbox.my.salesforce.com/?login");
	}

}
