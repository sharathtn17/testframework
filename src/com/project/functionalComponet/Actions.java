package com.project.functionalComponet;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.util.concurrent.FluentFuture;

public class Actions  {
	
	//wait implementation
	//Mouse Over
	//Double click
	//Assert
	
	
	public static void sendKeys(WebElement e,String S)
	{
		Waits.waitForElement(e).sendKeys(S);;
	
	}
}
