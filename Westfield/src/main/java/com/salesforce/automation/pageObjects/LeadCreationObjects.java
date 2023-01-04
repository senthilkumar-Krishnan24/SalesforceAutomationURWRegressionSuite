package com.salesforce.automation.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.salesforce.automation.Westfield.BrowserConfiguration;
import com.salesforce.automation.Westfield.JSExecutorClickAction;
import com.salesforce.automation.Westfield.WaitDriverClass;





public class LeadCreationObjects extends BrowserConfiguration{
	
	@FindBy(xpath="//a[@title='Leads']") WebElement newLead;
	@FindBy(xpath="//a[@title='New']")WebElement newButtton;
	@FindBy(xpath="//input[@name='lastName']") WebElement lastName;
	@FindBy(xpath="//input[@name='firstName']") WebElement firstName;
	@FindBy(xpath="//input[@name='Company']") WebElement b2bCustomer;
	@FindBy(xpath="//input[@name='Phone']") WebElement phone;
	@FindBy(xpath="//input[@name='MobilePhone']") WebElement MobilePhone;
	@FindBy(xpath="//input[@name='Email']") WebElement email;
	
	@FindBy(xpath="//label[text()='Sales Branch Level 1']")	WebElement SalesBranch1text;
	@FindBy(xpath="//button[@aria-label='Sales Branch Level 1, --None--']") WebElement SalesBranch1;
	@FindBy(xpath="//span[text()='Auto']") WebElement SB1listvalue;
	@FindBy(xpath="//button[@aria-label='Sales Branch Level 3, --None--']") WebElement SalesBranch3;
	@FindBy(xpath="//span[text()='Auto Dealer']") WebElement SB3listvalue;
	@FindBy(xpath="//button[@aria-label='Sales Branch Level 2, --None--']") WebElement SalesBranch2;
	@FindBy(xpath="//span[text()='Auto Dealer']") WebElement SB2listvalue;
	@FindBy(xpath="//button[@aria-label='L1 Code, --None--']") WebElement L1Code;
	@FindBy(xpath="//span[text()='1000']") WebElement L1Codelistvalue;
	@FindBy(xpath="//button[@aria-label='L2 Code, --None--']") WebElement L2Code;
	@FindBy(xpath="//span[text()='1001']") WebElement L2Codelistvalue;
	@FindBy(xpath="//button[@aria-label='L3 Code, --None--']") WebElement L3Code;
	@FindBy(xpath="//span[text()='1011']") WebElement L3Codelistvalue;
	
	@FindBy(xpath="//input[@aria-label='Country']") WebElement country ;
	@FindBy(xpath="//*[text()='United States of America']") WebElement countryListValue ;
	@FindBy(xpath="//*[@name='street']") WebElement Street ;
	@FindBy(xpath="//*[@name='city']") WebElement city ;
	@FindBy(xpath="//*[@aria-label='State/Province']") WebElement state ;
	@FindBy(xpath="//*[text()='Alabama']") WebElement stateListValue ;
	@FindBy(xpath="//input[@name='postalCode']") WebElement postalCode ;
	@FindBy(xpath="//button[@name='SaveEdit']") WebElement saveButtton; 
	
	/*
	 * public LeadCreationObjects(){
	 * 
	 * this.driver = driver; PageFactory.initElements(driver, this); }
	 */
	
	WaitDriverClass waitCustom = new WaitDriverClass();
	JSExecutorClickAction jsExecutorClick = new JSExecutorClickAction();
	
	
	public void createNewLead() throws InterruptedException {
		
	//create a New Lead	
		
		waitCustom.waitDriver_Until_ElementAppearsOnThePage(driver, 1000, newLead);
		jsExecutorClick.jsExecutorClickAction(driver, newLead);
		waitCustom.waitDriver_Until_ElementToBeClickable(driver, 10000, newButtton);
			
	// Fill Lead details
		
		waitCustom.waitDriver_Until_ElementAppearsOnThePage(driver, 10000, lastName);
		lastName.sendKeys("Krishnan");
		
		waitCustom.waitDriver_Until_ElementAppearsOnThePage(driver, 10000, firstName);
		firstName.sendKeys("Senthilkumar");
		
		b2bCustomer.sendKeys("Code Account");
		phone.sendKeys("9834534544");
		MobilePhone.sendKeys("34985738830");
		email.sendKeys("testemail@gmail.com");
		
		jsExecutorClick.jsExecutorScrollToElementAction(driver, SalesBranch1text);
		
	//SalesBranch1
		
		waitCustom.waitDriver_Until_ElementToBeClickable(driver, 1000, SalesBranch1);
		jsExecutorClick.jsExecutorClickAction(driver, SB1listvalue);
		
			
	//SalesBranch3
		
		waitCustom.waitDriver_Until_ElementToBeClickable(driver, 1000, SalesBranch3);
		jsExecutorClick.jsExecutorClickAction(driver, SB3listvalue);
		
				
	//SalesBranch2
		
		waitCustom.waitDriver_Until_ElementToBeClickable(driver, 1000, SalesBranch2);
		jsExecutorClick.jsExecutorClickAction(driver, SB2listvalue);
		
		
	//L1,L2,L3 Code
		
		waitCustom.waitDriver_Until_ElementToBeClickable(driver, 1000, L1Code);
		jsExecutorClick.jsExecutorClickAction(driver, L1Codelistvalue);
		waitCustom.waitDriver_Until_ElementToBeClickable(driver, 1000, L2Code);
		jsExecutorClick.jsExecutorClickAction(driver, L2Codelistvalue);
		waitCustom.waitDriver_Until_ElementToBeClickable(driver, 1000, L3Code);
		jsExecutorClick.jsExecutorClickAction(driver, L3Codelistvalue);
				
	// Add address
		
		waitCustom.waitDriver_Until_ElementToBeClickable(driver, 1000, country);
		jsExecutorClick.jsExecutorClickAction(driver, countryListValue);
		Street.sendKeys("test");
		city.sendKeys("Test");
		
		waitCustom.waitDriver_Until_ElementToBeClickable(driver, 1000, state);
		jsExecutorClick.jsExecutorClickAction(driver, stateListValue);
		postalCode.sendKeys("564333");
		//saveButtton.click();
		
		waitCustom.waitDriver_Until_ElementToBeClickable(driver, 1000, saveButtton);
		
		
	}


}
