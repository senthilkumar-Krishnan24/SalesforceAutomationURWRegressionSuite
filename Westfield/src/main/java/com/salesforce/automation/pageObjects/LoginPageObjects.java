package com.salesforce.automation.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.salesforce.automation.Westfield.BrowserConfiguration;



public class LoginPageObjects extends BrowserConfiguration {
	

	@FindBy(css="input#username[name^='username']") WebElement usrname; 
	@FindBy(css="input#password[name^='pw']") WebElement pasword;
	@FindBy(css="input#Login") WebElement loginButton;
	
	/*
	 * public LoginPageObjects(){
	 * 
	 * this.driver = driver; PageFactory.initElements(driver, this); }
	 */
	

	public void loginPageScreen() throws InterruptedException {
		
		usrname.sendKeys("senthilkumar.k@tavant.com.sit");
		pasword.sendKeys("welcomewelcomewelcomewelcome2022");
		loginButton.click();

		
	}


}
