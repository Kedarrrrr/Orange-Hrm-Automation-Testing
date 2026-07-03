package pageObjects;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration extends BasePage {
	public Registration(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	WebElement regMsg;
	
	@FindBy(xpath="//i[@class='fa fa-user']")
	WebElement accBtn;
	

	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement regBtn;
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement firstName;
	
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement eMail;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement telephone;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement pwd;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement cnfpwd;
	
	//Radio button
	@FindBy(xpath="//input[@value='0']")
	public WebElement subs;
	
	//checkbox
	@FindBy(xpath="//input[@name='agree']")
	public WebElement policy;
	
	@FindBy(xpath="//input[@value='Continue']")
	public WebElement cntBtn;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msg;
	
	
	//Action methods
	public String getArltMsg() {
		driver.switchTo().alert();
		String txt=regMsg.getText();
		driver.switchTo().defaultContent();
		return txt;
	}
	
	public String getMsg() {
		String t=regMsg.getText();
		return t;
	}
	public void register() {
		accBtn.click();
		regBtn.click();	
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		
	}
	
	public void setName(String name, String lastname) {
		
		firstName.sendKeys(name);
		lastName.sendKeys(lastname);
		
	}
	
	public void setEmail(String mail) {
		
		eMail.sendKeys(mail);
		
	}
	
	public void setTelephone(String phone) {
		
		telephone.sendKeys(phone);
	}
	
	public void setPassword(String pass) {
		
		pwd.sendKeys(pass);
		cnfpwd.sendKeys(pass);
	}
	
	public void final_Reg() {
		
		subs.click();
		policy.click();
		cntBtn.click();
		
	}
	
}
