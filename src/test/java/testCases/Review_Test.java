package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Login_Page;
import pageObjects.Review;
import testBase.BaseClass;

public class Review_Test extends BaseClass {

	@Test(priority=1)
	public void TC_022_Post_Review() {
		Login_Page lp = new Login_Page(driver);
		Review r= new Review(driver);
		lp.Log_In();
		Assert.assertEquals(r.review(p.getProperty("Txt")), "Thank you for your review. It has been submitted to the webmaster for approval.");
	}
}
