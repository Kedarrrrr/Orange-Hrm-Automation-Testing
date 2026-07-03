package testCases;

import java.time.Duration;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.Registration;
public class Register_Test{
	public Logger logger;
	public WebDriver driver;
	/*1 to 32 characters name surname and 3 to 32 character for telephone
	 * password must match to confirm password
	 * privacy policy must be accepted*/
	@BeforeClass
	public void setup() {
		//Logger logger = LogManager.getLogger(this.getClass());
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://localhost/Open%20Cart/");
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void Close() {
		driver.quit();
	}

	@Test(priority=1)
	public void TC_015_Register_Existing_Credential() {
		Registration r= new Registration(driver);
		r.register();
		//logger.info("Registration Clicked");
		r.setName("Jethalal", "Gadha");
		r.setEmail("gadhaelectronics@gmail.com");
		r.setTelephone("0900000000");
		r.setPassword("tapukepapa");
		//logger.info("Details filled.");
		r.final_Reg();
		Assert.assertEquals("Warning: E-Mail Address is already registered!", r.getMsg());
	}
	@Test(priority=2)
	public void TC_016_Register_Invalid_Credentials() {
		Registration r= new Registration(driver);
		r.register();
		r.setName("Jethalal", "Gadha");
		r.setEmail("gadhaelectronics@gmail.com");
		r.setTelephone("09");
		//div[@class='text-danger']
		//Telephone must be between 3 and 32 characters
		r.setPassword("tapukepapa");
		r.final_Reg();
		
		Assert.assertEquals(r.Telephone_warn(), "Telephone must be between 3 and 32 characters!");
	}
	
	@Test(priority=3)
	public void TC_017_Empty_Credentials() {
		Registration r =new Registration(driver);
		r.register();
		r.final_Reg();
		Assert.assertEquals(r.Password_warn(), "Password must be between 4 and 20 characters!");
	}
	
	@Test(priority=4)
	public void TC_018_Password_Mismatched() {
		Registration r =new Registration(driver);
		r.register();
		r.setPassword("tapukepapa");
		r.cnfpwd.clear();
		r.cnfpwd.sendKeys("jayantilal");
		r.final_Reg();
		Assert.assertEquals(r.Cnf_pwd_msg(), "Password confirmation does not match password!");
	}
	
	@Test(priority=5)
	public void TC_019_Privacy_Policy_not_accepted() {
		Registration r= new Registration(driver);
		r.register();
		r.setName("Jethalal", "Gadha");
		r.setEmail("gadhaelectonics@gmail.com");
		r.setTelephone("0916166161613");
		//div[@class='text-danger']
		//Telephone must be between 3 and 32 characters
		r.setPassword("tapuepapa");
		r.subs.click();
		r.cntBtn.click();
		Assert.assertEquals(r.Privacy_alert(), "Warning: You must agree to the Privacy Policy!");
	}
	
}
