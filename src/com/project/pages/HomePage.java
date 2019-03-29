package com.project.pages;

import java.sql.DriverManager;

import org.openqa.selenium.By;
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
	public HomePage(WebDriver driver2) {
		// TODO Auto-generated constructor stub

		this.driver=driver2;
	     PageFactory.initElements(driver2, this);
	}

	public HomePage homepage()
	{
		
	     return this;
		//super(p);
	}
	@FindBy(how=How.XPATH , using="//b")
	@CacheLookup
	WebElement ExpMessage;
	
	public HomePage VerifyLogin()
	{   System.out.println(HomePage.getTitle());
		//PageAssert.textPresent(ExpMessage, "**Failed Login**");
	//driver.switchTo().defaultCo.ntent();
	
	/*driver.findElement(By.xpath("//h2[contains(text(),'People also ask')"));
	System.out.println("inside home page");*/
	
	//driver.manage().timeouts().pageLoadTimeout(500,SECONDS);
	//DriverManager.getConnection(url);
		// new HomePage(driver);
	return this;
	
	}
	
	
	
	
}
