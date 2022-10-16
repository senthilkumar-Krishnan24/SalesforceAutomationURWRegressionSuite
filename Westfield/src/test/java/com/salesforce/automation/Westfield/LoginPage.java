package com.salesforce.automation.Westfield;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.salesforce.automation.pageObjects.LoginPageObjects;

public class LoginPage extends BrowserConfiguration{
	
public LoginPage(){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@Test
	public void loginPageTest() throws InterruptedException {
		
		LoginPageObjects obj = new LoginPageObjects();
		obj.loginPageScreen();
		
	}

}
