package com.project.functionalComponet;

import org.openqa.selenium.WebElement;

public class PageAssert {
	
	
	public static void textPresent( WebElement ele, String text ) {
		
		
		ele.getText().equals(text);
		
	}
	

}
