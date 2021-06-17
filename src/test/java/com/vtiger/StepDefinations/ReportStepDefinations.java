package com.vtiger.StepDefinations;

import com.vtiger.Pages.HomePage1;
import com.vtiger.Pages.ReportsPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ReportStepDefinations  extends BaseTest1{
	
	public HomePage1 hp1;
	public ReportsPage rp1;
	
	@Given("^User navigates to Reports page$")
	public void user_navigates_to_Reports_page() throws Throwable {
		
		hp1 = new HomePage1(driver);
		hp1.clickright();
		hp1.clickreports();
		
		
		
	}

	@Then("^user should test the reporting feature by creating new report$")
	public void user_should_test_the_reporting_feature_by_creating_new_report() throws Throwable {
		
		rp1 = new ReportsPage(driver);
		rp1.ReportTest();
		
	    
	}



}
