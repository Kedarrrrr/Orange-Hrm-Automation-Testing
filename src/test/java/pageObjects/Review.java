package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Review extends BasePage {

	public Review(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement search_box;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement search_btn;
	
	@FindBy(xpath="//div[@id='content']//div[1]//div[1]//div[2]//div[1]//h4[1]//a[1]")
	WebElement product;
	
	@FindBy(xpath="//a[normalize-space()='Reviews (0)']")
	WebElement review_btn;

	@FindBy(xpath="//textarea[@id='input-review']")
	WebElement input_review;

	@FindBy(xpath="//input[@value='3']")
	WebElement radio_review;

	@FindBy(xpath="//button[@id='button-review']")
	WebElement post_review;

	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement msg;

	public String review(String R) {
		search_box.sendKeys("MacBook");
		search_btn.click();
		product.click();
		review_btn.click();
		input_review.sendKeys(R);
		radio_review.click();
		post_review.click();
		return msg.getText();
	}
}
