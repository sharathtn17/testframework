package com.project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.project.functionalComponet.Actions;
import com.project.functionalComponet.PageAssert;

public class HomePage  extends Page{
	
	WebDriver driver;
	public HomePage(WebDriver rdriver)
	{
		this.driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(how=How.XPATH , using="//b")
	@CacheLookup
	WebElement ExpMessage;
	
	public HomePage VerifyLogin(String uname)
	{   System.out.println(HomePage.getTitle());
		PageAssert.textPresent(ExpMessage, "**Failed Login**");
		return new HomePage(driver);
	}
	
	
}
