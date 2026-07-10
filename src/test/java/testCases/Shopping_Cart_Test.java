package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Login_Page;
import pageObjects.Shopping_Cart;
import testBase.BaseClass;

public class Shopping_Cart_Test extends BaseClass {
	
	@Test(priority=1)
	public void TC_008_add_Item_Cart() {
		Login_Page lp = new Login_Page(driver);
		lp.Log_In();
		Shopping_Cart sc=new Shopping_Cart(driver);
		sc.add_cart();
		Assert.assertEquals(true, sc.Table());
	}
	
	@Test(priority=2)
	public void TC_009_Remove_Item_Cart() {
		Shopping_Cart sc=new Shopping_Cart(driver);
		Assert.assertEquals(sc.remove_item(),"Your shopping cart is empty!");
	}
}
