package com.project.pages;

import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.project.functionalComponet.Actions;

public class LoginPage extends Page{
	
	WebDriver driver;
	
	public LoginPage(WebDriver rdriver)
	{
		this.driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(name="username")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name="FormsButton2")
	@CacheLookup
	WebElement btnLogin;
	
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	@CacheLookup
	WebElement lnkLogout;
	
	
	 
	public LoginPage setUserName(String uname)
	{
		Actions.sendKeys(txtUserName, uname);
		return new LoginPage(driver);
	}
	
	public LoginPage setPassword(String pwd)
	{    System.out.println(Page.getTitle());
		Actions.sendKeys(txtPassword,pwd);
		return new LoginPage(driver);
	}
	
	
	public HomePage clickSubmit()
	{  
		btnLogin.click();
		return new HomePage(driver);
	}	
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
	
	
	

}
