package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Gift_Card;
import pageObjects.Login_Page;
import testBase.BaseClass;

public class Gift_Card_Test extends BaseClass {

	@Test(priority=1)
	public void TC_024_Buy_Gift_Card() {
		Login_Page lp = new Login_Page(driver);
		Gift_Card gc= new Gift_Card(driver);
		lp.Log_In();
		String Name= p.getProperty("person2_name");
		String Email=p.getProperty("person2_email");
		Assert.assertEquals(gc.buy_card(Name, Email),true);
	}
	
	@Test(priority=2)
	public void TC_025_Empty_Credentials() {
		Gift_Card gc = new Gift_Card(driver);
		String msg=gc.empty_name();
		Assert.assertTrue(msg.contains("Recipient's Name must be between 1 and 64 characters!"));
	}
	
	@Test(priority=3)
	public void TC_026_Wrong_Mail() {
		Gift_Card gc = new Gift_Card(driver);
		String msg=gc.Wrong_Mail();
		Assert.assertEquals(msg, "E-Mail Address does not appear to be valid!");
	}
}
