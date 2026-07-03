package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UI_Smoke extends BasePage{

	public UI_Smoke(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//img[@title='Your Store']
	//div[@class='collapse navbar-collapse navbar-ex1-collapse']
	//div[@class='swiper-slide text-center swiper-slide-active']//img[@alt='MacBookAir']
	//div[@class='swiper-slide text-center swiper-slide-duplicate swiper-slide-active']//img[@alt='iPhone 6']
	//body//footer//div[@class='container']
	//div[@class='col-sm-5']
	//input[@placeholder='Search']
	//button[@class='btn btn-default btn-lg']

	@FindBy(xpath="//img[@title='Your Store']")
	WebElement icon;
	
	@FindBy(xpath="//div[@class='collapse navbar-collapse navbar-ex1-collapse']")
	WebElement nav_bar;
	
	@FindBy(xpath="//div[@class='swiper-slide text-center swiper-slide-active']//img[@alt='MacBookAir']")
	WebElement mac_air;
	
	@FindBy(xpath="	//div[@class='swiper-slide text-center swiper-slide-duplicate swiper-slide-active']//img[@alt='iPhone 6']")
	WebElement iphone;
	
	@FindBy(xpath="//body//footer//div[@class='container']")
	WebElement footer;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement Search_box;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement Search_btn;
	
	public boolean Icon() {
		return icon.isDisplayed();
	}
	
	public boolean Navigation_bar() {
		return nav_bar.isDisplayed();
	}
	
	public boolean Swiper1() {
		return mac_air.isDisplayed();
	}
	
	public boolean Swiper2() {
		return iphone.isDisplayed();
	}
	
	public boolean Footer() {
		return footer.isDisplayed();
	}
	public boolean Search_BOX() {
		return Search_box.isDisplayed();
	}
	public boolean Searh_BUTTON() {
		return Search_btn.isDisplayed();
	}
	
}
