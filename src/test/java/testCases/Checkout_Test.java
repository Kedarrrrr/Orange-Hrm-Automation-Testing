package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Checkout;
import pageObjects.Login_Page;
import testBase.BaseClass;

public class Checkout_Test extends BaseClass{

	@Test(groups= {"sanity","smoke","regression"})
	public void TC_010_CheckOut_Item() {
		Login_Page lp=new Login_Page(driver);
		lp.Log_In();
		Checkout co = new Checkout(driver);
		co.add_Item("MacBook");
		co.fill_Details_existing();
		String s=co.place_order(p.getProperty("Txt"));
		
		Assert.assertTrue(s.contains("Warning: Payment method required!"));
	}
}
