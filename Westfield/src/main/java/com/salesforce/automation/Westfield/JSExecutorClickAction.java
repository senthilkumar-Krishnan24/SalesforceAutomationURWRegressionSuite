package com.salesforce.automation.Westfield;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import io.testproject.sdk.drivers.web.ChromeDriver;

public class JSExecutorClickAction extends BrowserConfiguration {
	
	
	public ChromeDriver jsExecutorClickAction(ChromeDriver driver, WebElement elem) {
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", elem);
		
		return driver;
		
	}
	
	public ChromeDriver jsExecutorScrollToElementAction(ChromeDriver driver, WebElement elem) {
		
		JavascriptExecutor jvexec = (JavascriptExecutor)driver;
		jvexec.executeScript("arguments[0].scrollIntoView(true);", elem);
		
		return driver;
	}

}
