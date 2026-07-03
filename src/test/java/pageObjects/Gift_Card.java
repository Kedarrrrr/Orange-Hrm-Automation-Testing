package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Gift_Card extends BasePage {

	public Gift_Card(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//a[normalize-space()='Gift Certificates']
	//a[normalize-space()='Gift Certificates']
	//a[normalize-space()='Gift Certificates']
	//a[normalize-space()='Gift Certificates']
	//input[@id='input-to-name']
	//input[@id='input-to-email']
	//input[@value='8']
	//input[@name='agree']
	//input[@value='Continue']
	@FindBy(xpath="//a[normalize-space()='Gift Certificates']")
	WebElement Gift_btn;
	
	@FindBy(xpath="//input[@id='input-to-name']")
	WebElement r_name;
	
	@FindBy(xpath="//input[@id='input-to-email']")
	WebElement r_email;
	
	@FindBy(xpath="//input[@value='8']")
	WebElement purpose;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement tandc;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement buy;
	
	@FindBy(xpath="//div[@class='text-danger']")
	WebElement wrong_mail;
	
	@FindBy(xpath="//form[@class='form-horizontal']")
	WebElement wrong_name;

	@FindBy(xpath="//div[contains(text(),'E-Mail Address does not appear to be valid!')]")
	WebElement email_msg;
	
	public boolean buy_card(String name, String email) {
		Gift_btn.click();
		r_name.sendKeys(name);
		r_email.sendKeys(email);
		purpose.click();
		tandc.click();
		buy.click();
		return buy.isDisplayed();
	}
	public String empty_name() {
		Gift_btn.click();
		purpose.click();
		tandc.click();
		buy.click();
		//Recipient's Name must be between 1 and 64 characters!
		return wrong_name.getText();	
	}
	public String Wrong_Mail() {
		Gift_btn.click();
		r_name.sendKeys("ipsita");
		r_email.sendKeys("sewergs");
		purpose.click();
		tandc.click();
		buy.click();
		return email_msg.getText();
	}
}
