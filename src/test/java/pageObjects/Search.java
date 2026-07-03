package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search extends BasePage{

	public Search(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement search_box;
	
					//button[@class='btn btn-default btn-lg']
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement sb;
	
	@FindBy(xpath="//div[@class='caption']/h4/a")
	List<WebElement> product_list;
	
	@FindBy(xpath="//p[contains(text(),'There is no product that matches the search criter')]")
	WebElement txt;
	

	
	public String empty_search() {
		search_box.clear();
		sb.click();
		return txt.getText();
		//There is no product that matches the search criteria.
	}
	
	public String special_search() {
		search_box.sendKeys("@#$%^H9");
		sb.click();
		return txt.getText();
	}
	
	public List<String> matching_products() {
		List<String> products= new ArrayList<>();
		for(WebElement product_name:product_list) {
			String name=product_name.getText();
			
			if(name.toLowerCase().contains("mac")) {
				products.add(name);
			}
		}
		return products;
	}
	public void Search_product(String p) {
		search_box.clear();
		search_box.sendKeys(p);
		sb.click();
	}
	public String msg() {
		return txt.getText();
	}

}
