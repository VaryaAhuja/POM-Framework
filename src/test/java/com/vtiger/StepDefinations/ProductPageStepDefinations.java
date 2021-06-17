package com.vtiger.StepDefinations;

import com.vtiger.Pages.HomePage1;
import com.vtiger.Pages.ProductPage1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ProductPageStepDefinations extends BaseTest1 {
	
	public HomePage1 hp1;
	public ProductPage1 pp1;

	
	@Given("^user should navigate to product page$")
	public void user_should_navigate_to_product_page() throws Throwable {
		hp1 = new HomePage1(driver);
		hp1.clicknewproduct();
	   
	}

	@Then("^user should verify productpage functionality by uploading file$")
	public void user_should_verify_productpage_functionality_by_uploading_file() throws Throwable {
	    pp1 = new ProductPage1(driver);
	    pp1.producttest("new","AltvetPet Inc.","Hardware","Accounts","303-Interest-Income");
	}


}
