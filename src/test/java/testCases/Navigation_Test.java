package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Navigation;
import testBase.BaseClass;

public class Navigation_Test extends BaseClass{

	@Test(priority=1)
	public void TC_020_Catagory_navigate() {
		Navigation n=new Navigation(driver);
		Assert.assertEquals(n.navigate_product_from_catagory(), true);
	}
	@Test(priority=2)
	public void TC_021_Navigate_Home(){
		Navigation n= new Navigation(driver);
		Assert.assertEquals(n.navigate_home(), true);
	}
}
