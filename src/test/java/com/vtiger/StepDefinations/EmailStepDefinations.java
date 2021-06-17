package com.vtiger.StepDefinations;

import com.vtiger.Pages.EmailPage;
import com.vtiger.Pages.HomePage1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class EmailStepDefinations extends BaseTest1 {
	
	public HomePage1 hp1;
	
	public EmailPage ep1;
	
	
	@Given("^user should navigate to emailpage$")
	public void user_should_navigate_to_emailpage() throws Throwable {
		hp1 = new HomePage1(driver);
		hp1.clickEmails();
	    
	}

	@Then("^user shoould create the email custom view$")
	public void user_shoould_create_the_email_custom_view() throws Throwable {
		ep1 = new EmailPage(driver);
		ep1.emailtest();
	    
	}


}
