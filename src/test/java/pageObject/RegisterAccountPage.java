package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterAccountPage extends BasePage
{
  
	public RegisterAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement FirstName;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement LastName;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement Email;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement Password;
	
	@FindBy(xpath="//button[text()='Continue']")
	WebElement ContinueButton;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement CheckBox;
	
	public void setFirstName(String fname)
	{
		FirstName.sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		LastName.sendKeys(lname);
	}
	
	public void setEmail(String email)
	{
		Email.sendKeys(email);
	}
	
	public void setPassword(String password)
	{
		Password.sendKeys(password);
	}
	
	public void continueButton()
	{
		ContinueButton.submit();
	}
	
	public void checkBox()
	{
		CheckBox.click();
	}
}
