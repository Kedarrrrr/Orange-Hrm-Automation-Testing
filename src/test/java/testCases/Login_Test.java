package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Login_Page;
import testBase.BaseClass;

public class Login_Test extends BaseClass {

	
	@Test(priority=2)
	public void TC_002() {
		//login test with correct credentials
		Login_Page lt = new Login_Page(driver);
		//lt.Logout();
		lt.start();
		lt.setMail("gadhaelectronics@gmail.com");
		lt.setPwd("tapukepapa");
		lt.logintn.click();
		
		Assert.assertEquals("My Account", lt.compare_txt());
	}
	
	@Test(priority=1)
	public void TC_003(){
		//Login Test with incorrect credentials
		Login_Page lt = new Login_Page(driver);
		lt.start();
		lt.setMail("gadhaeletronis@gmail.com");
		lt.setPwd("tapukeppa");
		lt.logintn.click();
		//driver.switchTo().alert();
		Assert.assertTrue(lt.failed_login_msg().contains("Warning:"));
		//Assert.assertEquals("Warning: No match for E-Mail Address and/or Password.", lt.failed_login_msg());		
	}
}
