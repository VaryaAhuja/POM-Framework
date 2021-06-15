package com.vtiger.StepDefinations;

import com.vtiger.Pages.HomePage1;
import com.vtiger.Pages.LoginPage1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinations extends BaseTest1 {
	
	public HomePage1 hp1;
	public LoginPage1 lp1;
	
	@Given("^Application should be launched with <url>$")
	public void application_should_be_launched_with_url() throws Throwable {
		readersetting();
		
	    
	}

	@When("^user enters valid userid and password$")
	public void user_enters_valid_useerid_and_password() throws Throwable {
	   lp1.SetUsername("admin");
	   lp1.SetPassword("admin");
	}

	@When("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		lp1.Login();
	   
	}

	@Then("^user should be navigated to homepage$")
	public void user_should_be_navigated_to_homepage() throws Throwable {
		hp1.homepagelogin();
	   
	}

	@Then("^User should see the logout link$")
	public void user_should_see_the_logout_link() throws Throwable {
		hp1.verifylogout();
	    
	}



}
