package com.project.functionalComponet;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;*/

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;



public class BaseTest {
	

	/*ReadConfig readconfig=new ReadConfig();
	
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();*/
	public static WebDriver driver;
	
	//public static Logger logger;
	
	//@Parameters("browser")
	@BeforeClass
	public void setup()
	{			
	/*	logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("Log4j.properties");*/
		
		/*if(br.equals("chrome"))
		{*/
		System.setProperty("webdriver.chrome.driver", "C:/WebDriverServerStart/chromedriver.exe");
		driver=new ChromeDriver();
		/*}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
			driver = new FirefoxDriver();
		}
		else if(br.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver",readconfig.getIEPath());
			driver = new InternetExplorerDriver();
		}
		*/
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://thedemosite.co.uk/login.php");
	}
	
	/*@AfterClass
	public void tearDown()
	{
		driver.quit();
	}*/
	
	/*public void captureScreen(WebDriver driver, String tname) throws IOException {
		WebDriverWait wait = new WebDriverWait(driver, 10); 
		Alert alert = wait.until(ExpectedConditions.alertIsPresent()); 
		//alert.authenticateUsing(new UserAndPassword(**username**, **password**));
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
	public String randomestring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);
	}
	
	public static String randomeNum() {
		String generatedString2 = RandomStringUtils.randomNumeric(4);
		return (generatedString2);
	}*/
	
	

}
