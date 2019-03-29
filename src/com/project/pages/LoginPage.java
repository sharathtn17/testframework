package com.project.pages;

import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.project.functionalComponet.Actions;

public class LoginPage extends Page{
	
	public LoginPage(WebDriver rdriver) {

		this.driver=rdriver;
		PageFactory.initElements(rdriver, this);
		// TODO Auto-generated constructor stub
	}
	WebDriver driver;
	
	public LoginPage loginPage()
	{
		return this;
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
	
	@FindBy(name="q")
	@CacheLookup
	WebElement searchbox;
	
	@FindBy(how=How.NAME, using="btnK")
	@CacheLookup
	WebElement button;
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	@CacheLookup
	WebElement lnkLogout;
	
	
	
	
	 
	public LoginPage setUserName(String uname)
	{
		Actions.sendKeys(txtUserName, uname);
		return this;
	}
	
	
	public LoginPage typetext(String uname)
	{
		Actions.sendKeys(searchbox, uname);
		return this;
	}
	
	public HomePage submitb()
	{
		Actions.click(button);
		return this._homePage();
	}
	public LoginPage setPassword(String pwd)
	{    System.out.println(Page.getTitle());
		Actions.sendKeys(txtPassword,pwd);
		return this;
	}
	
	
	public HomePage clickSubmit()
	{  
		//btnLogin.click();
		return new HomePage(driver);
	}	
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
	
	
	

}
