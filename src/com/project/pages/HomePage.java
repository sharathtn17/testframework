package com.project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.project.functionalComponet.Actions;
import com.project.functionalComponet.PageAssert;

public class HomePage  extends Actions{
	
	WebDriver driver;
	public HomePage(WebDriver rdriver)
	{
		this.driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(how=How.XPATH , using="//b")
	@CacheLookup
	WebElement Message;
	
	public HomePage VerifyLogin(String uname)
	{
		PageAssert.textPresent(Message, "**Failed Login**");
		return new HomePage(driver);
	}
}
