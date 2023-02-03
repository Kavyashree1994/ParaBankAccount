package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class accountPage {
	
public WebDriver ldriver;

        @FindBy(css = "#leftPanel > h2")
         WebElement accountServices;
        
        @FindBy(linkText = "Open New Account")
        WebElement openNewAccount;
        
        @FindBy(id = "rightPanel")
        WebElement openNewAccountRightPanel;
        
        @FindBy(id = "type")
        WebElement accountType;
        
        @FindBy(id = "fromAccountId")
        WebElement transferExistingAccount;
        
        @FindBy(xpath = "//input[@value='Open New Account']")
        WebElement submitOpenNewAccount;
        
        @FindBy(xpath = "//div[@class='ng-scope']/h1")
        WebElement accountopened;
	
	public accountPage(WebDriver rdriver)
	{
		ldriver= rdriver;
		PageFactory.initElements(ldriver, this);	
	}
	
	public void verifyAccountSection()
	{
		accountServices.isDisplayed();
	}
	
	public void verifyOpenNewAccount()
	{
		openNewAccount.isDisplayed();
	}
	public void verifyopennewaccountheader()
	{
		openNewAccountRightPanel.isDisplayed();
	}
	public void clickOpenNewAccount()
	{
		openNewAccount.click();
	}
	
	public void verifyAccountType()
	{
		accountType.isDisplayed();
	}
	
	public void verifyTransferAccount()
	{
		transferExistingAccount.isDisplayed();
	}
	public void selectAccountType()
	{
		Select accType = new Select(accountType);
		accType.selectByValue("1");
	}
	public void selectTransferAccount()
	{
		Select transferAcc = new Select(transferExistingAccount);
		transferAcc.selectByIndex(0);
	}
	public void submitOpenNewAccountButton() throws InterruptedException
	{
		submitOpenNewAccount.click();
		Thread.sleep(5000);
	}
	public void verifyAccountOpened()
	{
		String expectedText = "Account Opened!";
		String actualText=accountopened.getText();
		Assert.assertTrue(actualText.equalsIgnoreCase(expectedText));
	}
	
}
