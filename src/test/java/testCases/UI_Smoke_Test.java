package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.UI_Smoke;
import testBase.BaseClass;

public class UI_Smoke_Test extends BaseClass {

	@Test(priority=1, groups= {"smoke","regression"})
	public void TC_027_Open_Cart_logo() {
		UI_Smoke ui=new UI_Smoke(driver);
		Assert.assertEquals(ui.Icon(), true);
	}
	
	@Test(priority=2, groups= {"smoke","regression"})
	public void TC_028_Nav_Bar_display() {
		UI_Smoke ui=new UI_Smoke(driver);
		Assert.assertEquals(ui.Navigation_bar(), true);
	}
	
	@Test(priority=3, groups= {"smoke","regression"})
	public void TC_029_Footer_Display() {
		UI_Smoke ui=new UI_Smoke(driver);
		Assert.assertEquals(ui.Footer(), true);
	}
	
	@Test(priority=4, groups= {"smoke","regression"})
	public void TC_030_Swiper1_Display() {
		UI_Smoke ui=new UI_Smoke(driver);
		Assert.assertEquals(ui.Swiper1(), true);
	}
	
	@Test(priority=5, groups= {"smoke","regression"})
	public void TC_031_Swiper2_Display() {
		UI_Smoke ui=new UI_Smoke(driver);
		Assert.assertEquals(ui.Swiper2(), true);
	}
	
	@Test(priority=6, groups= {"smoke","regression"})
	public void TC_032_Search_box_Display() {
		UI_Smoke ui=new UI_Smoke(driver);
		Assert.assertEquals(ui.Search_BOX(), true);
	}
	
	@Test(priority=7, groups= {"smoke","regression"})
	public void TC_033_Search_Button_Display() {
		UI_Smoke ui=new UI_Smoke(driver);
		Assert.assertEquals(ui.Searh_BUTTON(), true);
	}
}
