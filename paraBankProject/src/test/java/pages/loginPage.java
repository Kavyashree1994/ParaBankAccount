package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	@FindBy(name ="username")
	WebElement txtusername;
	
	@FindBy(name ="password")
	WebElement txtpassword;
	
	@FindBy(xpath = "//input[@value='Log In']")
	WebElement btnlogin;
	
	WebDriver driver;
	
	public loginPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void enterUsername(String username)
	{
		txtusername.sendKeys(username);	
	}
	public void enterPassword(String password)
	{
		txtpassword.sendKeys(password);	
	}
	public void clickOnLogin()
	{
		btnlogin.click();
	}
	
	
	

}
