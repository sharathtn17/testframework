package com.project.tests;

import java.io.IOException;

import org.testng.annotations.Test;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

import com.project.functionalComponet.BaseTest;
import com.project.pages.LoginPage;

import PageAction.LoginPageAction;

public class TC_LoginTC extends BaseTest{
	
	

	@Test
	public void loginTest() throws IOException 
	{
			
		//logger.info("URL is opened");
		
		try {
			LoginPageAction.signIN_Action("selenium", "selenium").VerifyLogin("");
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	logger.info("Entered username");

}

}