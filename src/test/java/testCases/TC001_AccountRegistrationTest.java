package testCases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.RegisterAccountPage;


public class TC001_AccountRegistrationTest extends BaseClass
{
  
	
	@Test
	public void verifyAccountRegistrationTest()
	{
		HomePage h=new HomePage(driver);
		h.clickMyAccount();
		h.clickRegister();
		
		RegisterAccountPage r=new RegisterAccountPage(driver);
		r.setFirstName("Vishwa");
		r.setLastName("Lekha");
		r.setEmail("vishwanathan.seee999@gmail.com");
		r.setPassword("Test@789");
		r.continueButton();
		r.checkBox();
	}
	
}
