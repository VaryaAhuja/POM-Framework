package com.vtiger.Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.lib.Commonarguments;

public class AccountPage1 extends HeaderPage1 {
	
	public  WebDriver driver;
	
	Commonarguments ca = new Commonarguments();
	
	public AccountPage1(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(name="accountname")
	WebElement elmacc;
	
	@FindBy(name="btn1")
	WebElement elmbtn;
	
	@FindBy(name="name")
	WebElement elmclass;
	
	@FindBy(name="button")
	WebElement elmsearch;
	
	@FindBy(xpath="//input[@name='button'][1]")
	WebElement elmsav;
	
	
	@FindBy(linkText="vtiger")
	WebElement elmtiger;
	
	@FindBy(linkText="vtigerCRM Inc")
	WebElement elmvt;
	
	
	
	
	
	public void createaccount(String accname)
	{
		
		ca.EnterValue(driver, elmacc,accname,"Account");
	
	}
	
	public void createaccset()
	{
		
		
		ca.ClickElement(driver,elmbtn,"button");
		ca.switchwindow(driver,elmvt,"Entered");
		
		
		ca.ClickElement(driver,elmsav,"saved data");
		
				
	}
	
	
	
	

}
