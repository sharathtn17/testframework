package PageAction;

import org.testng.Assert;

import com.project.functionalComponet.BaseTest;
import com.project.pages.HomePage;
import com.project.pages.LoginPage;

public class LoginPageAction extends BaseTest {

	//Action which are common
	//example sign in
	public static  HomePage signIN_Action(String UserName,String Password) throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(UserName);
		lp.setPassword(Password);
        lp.clickSubmit();
		
		//Thread.sleep(3000);
		
		/*if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();//close alert
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			//logger.warn("Login failed");
		}
		else
		{
			Assert.assertTrue(true);
			//logger.info("Login passed");
			lp.clickLogout();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();//close logout alert
			driver.switchTo().defaultContent();
			
		}
		
		 */
		return new HomePage(driver);
		
	}
	
	
}
