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
	

	
}
