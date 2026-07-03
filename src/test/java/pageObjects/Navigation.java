package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Navigation extends BasePage {

	public Navigation(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//a[normalize-space()='Desktops']")
	WebElement dsk;

	@FindBy(xpath="//a[normalize-space()='Show All Desktops']")
	WebElement all;

	
	@FindBy(xpath="//img[@title='Desktops']")
	WebElement dskimg;

	
	@FindBy(xpath="//a[normalize-space()='Apple Cinema 30\"']")
	WebElement catagory_product;

	
	@FindBy(xpath="//a[normalize-space()='Apple Cinema 30\"']")
	WebElement product_img;

	
	@FindBy(xpath="//img[@title='Your Store']")
	WebElement Open_Cart_icon;

	
	@FindBy(xpath="//img[@title='Your Store']")
	WebElement x;

	public boolean navigate_product_from_catagory() {
		dsk.click();
		all.click();
		dskimg.click();
		catagory_product.click();
		return product_img.isDisplayed();
	}
	
	public boolean navigate_home() {
		Open_Cart_icon.click();
		return x.isDisplayed();
	}
}
