package com.vtiger.StepDefinations;

import com.vtiger.Pages.AccountPage1;
import com.vtiger.Pages.HomePage1;
import com.vtiger.Pages.LoginPage1;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccountStepDefinations extends BaseTest1 {
	
	public AccountPage1 ap1;
	
	public HomePage1 hp1;
	
	
	public LoginPage1 lp1;
	
	@Given("^Application should be launched with <url>$")
	public void application_should_be_launched_with_url() throws Throwable {
		readersetting();
		logger = extent.createTest("Verify Account page");
		    
	}

	@When("^User enters userid and password$")
	public void user_enters_userid_and_password() throws Throwable {
	
   	lp1 = new LoginPage1(driver);
    lp1.SetUsername();
    lp1.SetPassword();
	}

	@When("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		lp1.Login();
	}
	
	@Then("^user navigated to homepage$")
	public void user_navigated_to_homepage() throws Throwable {
	  
	 	hp1 = new HomePage1(driver);
		hp1.homepagelogin();
		
	}
	   

	@And("^user clicks on account link$")
	public void user_clicks_on_account_link() throws Throwable {
		
		hp1.clicknewaccount();
		
		
	    
	}

	@Then("^user navigated to accounts page$")
	public void user_navigated_to_accounts_page() throws Throwable {
		ap1 = new AccountPage1(driver);
		ap1.createaccount("vtiger");
		
	    
	}

	@Then("^user creates new account$")
	public void user_creates_new_account() throws Throwable {
		ap1.createaccset();
	   
	}

	
	}



	

