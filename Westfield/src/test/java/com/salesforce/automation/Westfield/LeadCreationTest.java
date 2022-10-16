package com.salesforce.automation.Westfield;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.salesforce.automation.pageObjects.LeadCreationObjects;

public class LeadCreationTest extends BrowserConfiguration{
	
public LeadCreationTest(){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@Test
	public void createNewLeadTest() throws InterruptedException {
		
		LeadCreationObjects obj1 = new LeadCreationObjects();
		obj1.createNewLead();
		
	}

}
