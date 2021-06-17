package com.vtiger.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.lib.Commonarguments;

public class ActivitiesPage1  extends HeaderPage1{
	
	public WebDriver driver;
	
	public ActivitiesPage1(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	Commonarguments ca = new Commonarguments();
	
	@FindBy(linkText="Call user - John")
	WebElement elmuser;
	
	@FindBy(xpath="//input[@name='button'][30]")
	WebElement elmtt;
	
	@FindBy(linkText="Create View")
	WebElement elmview;
	
	@FindBy(name="viewName")
	WebElement elmname;
	
	@FindBy(name="column1")
	WebElement elmmn1;
	
	@FindBy(name="stdDateFilterField")
	WebElement elmfi;
	
	@FindBy(name="stdDateFilter")
	WebElement elmda;
	
	@FindBy(xpath="//input[@name='save'][1]")
	WebElement elmsave;
	
	public void activitytest()
	{
		clickactivities();
		ca.ClickElement(driver,elmuser,"user");
		
	}
	
	public void createview()
	{
		ca.ClickElement(driver,elmview,"view");
		ca.EnterValue(driver,elmname,"vtiger","entered");
		ca.EnterValue(driver,elmmn1,"cntactivityrel:contactid:contact_id:Activities_Contact_Name:I","activity");
		ca.EnterValue(driver,elmfi,"crmentity:createdtime:createdtime:Activities_Created_Time","custom");
		ca.EnterValue(driver,elmda,"Next FY","fy");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ca.ClickElement(driver,elmsave,"save");
		
		ca.popupalertaccept(driver, "accepted");
		//ca.ClickElement(driver,elmsave,"save");
		
		
	}

}
