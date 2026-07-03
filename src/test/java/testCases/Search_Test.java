package testCases;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Login_Page;
import pageObjects.Search;
import testBase.BaseClass;

public class Search_Test extends BaseClass {

	@Test(priority=1)
	public void TC_011_Empty_Search() {
		Login_Page lp=new Login_Page(driver);
		Search s = new Search(driver);

		lp.Log_In();
		Assert.assertEquals(s.empty_search(), "There is no product that matches the search criteria.");
	}
	
	@Test(priority=2)
	public void TC_012_Search_Special_Char() {
		Search s = new Search(driver);
		Assert.assertEquals(s.special_search(), "There is no product that matches the search criteria.");
	}
	
	@Test(priority=3)
	public void TC_013_Partial_name() {
		
		Search s = new Search(driver);
		s.Search_product("mac");
		List<String> p_list=s.matching_products();
		Assert.assertEquals(p_list.isEmpty(), false);
	}
	@Test(priority=4)
	public void TC_014_Non_Existing_Product() {
		
		Search s= new Search(driver);
		s.Search_product("Biryani");
		Assert.assertEquals(s.msg(),"There is no product that matches the search criteria.");
	}
	
}
