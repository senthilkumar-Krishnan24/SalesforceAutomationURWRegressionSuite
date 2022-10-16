package com.salesforce.automation.Westfield;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.testproject.sdk.drivers.web.ChromeDriver;

public class WaitDriverClass {
	
public ChromeDriver waitDriver_Until_ElementAppearsOnThePage(ChromeDriver driver, int n, WebElement elem) {
		
		WebDriverWait wait = new WebDriverWait(driver, n);
		wait.until(ExpectedConditions.visibilityOf(elem)).isDisplayed();
		return driver;
	}
	
	public ChromeDriver waitDriver_Until_ElementToBeClickable(ChromeDriver driver, long n, WebElement elemm) {
		
		WebDriverWait wait5 = new WebDriverWait(driver, n);
		wait5.until(ExpectedConditions.elementToBeClickable(elemm)).click();
		return driver;
	}
	
	public void waitDriver_Until_ElementToBeClickable(ChromeDriver driver, int n, WebElement elemm) {
		
		WebDriverWait wait5 = new WebDriverWait(driver, n);
		wait5.until(ExpectedConditions.elementToBeClickable(elemm)).click();
		
	}
	


}
