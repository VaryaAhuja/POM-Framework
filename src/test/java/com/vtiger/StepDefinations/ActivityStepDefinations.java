package com.vtiger.StepDefinations;

import com.vtiger.Pages.ActivitiesPage1;
import com.vtiger.Pages.HomePage1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ActivityStepDefinations extends BaseTest1{
	
	public ActivitiesPage1 ap1;
	public HomePage1 hp1;
	
	
	@Given("^Launch the Activity Page$")
	public void launch_the_Activity_Page() throws Throwable {
		hp1 = new HomePage1(driver);
		hp1.clickactivities();    
	
	
	}

	@Then("^user click on create view link$")
	public void user_click_on_create_view_link() throws Throwable {
		
		ap1 = new ActivitiesPage1(driver);
		ap1.createview();
	   
	}

	



}
