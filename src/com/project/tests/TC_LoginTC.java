package com.project.tests;

import java.io.IOException;
import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

import com.project.functionalComponet.BaseTest;
import com.project.functionalComponet.Users;
import com.project.pages.LoginPage;

import PageAction.LoginPageAction;

public class TC_LoginTC extends BaseTest{
	
	
	@Test
	public void loginTest() throws IOException 
	{
			
		/*//logger.info("URL is opened");
		
		//LoginPageAction.signIN_Action("selenium", "selenium").VerifyLogin("");
		LoginPage lp=new LoginPage(driver);
		lp.typetext("isdisplayed in selenium")
		.submitb()
		sys
		.VerifyLogin();*/
	//	System.out.println(username +" "+ pwd +" "+env+" "+inti);
		Users.driver.get("https://freecrm.com/");
		Actions act=new Actions(driver);
		WebElement CRM=driver.findElement(By.xpath("//a[contains(text(),'CRM')]"));
		
		act.moveToElement(CRM).build().perform();
		
		driver.findElement(By.xpath("//a[contains(text(),'Call Center')]")).click();
		System.out.println("Hi");
		//._homePage()
		/*.Loginpage()
		.setUserName("wqqwqwq")
		//.setPassword("qwqwqwq")
		.clickSubmit()
		.VerifyLogin()
		._loginPage()
		.setPassword("dsdsdd");*/
		
		
		

}
	
	@DataProvider(name="login")
	public Object[][] dataProvider()
	{
		return new Object[][]{
			{"name1","pwd1","qa",10} ,{"name2","pwd2","PROD",76565765}
		
		                     
	};
	}
	

}