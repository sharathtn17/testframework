package com.project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.project.functionalComponet.Actions;

public class LoginPage extends Actions{
	
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
	
	
	
	public void setUserName(String uname)
	{
		Actions.sendKeys(txtUserName, uname);
		
	}
	
	public void setPassword(String pwd)
	{
		Actions.sendKeys(txtPassword,pwd);
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
