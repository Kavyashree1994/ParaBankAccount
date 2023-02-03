package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class accountOverviewPage {

	public WebDriver ldriver;
	@FindBy(linkText = "Accounts Overview")
	WebElement accountsOverview;

	@FindBy(xpath = "//tr[@class ='ng-scope']")
	List<WebElement> allAccounts;

	@FindBy(linkText = "Log Out")
	WebElement clickLogOut;

	public accountOverviewPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	public void clickAccountsOverview() {
		accountsOverview.click();
	}

	public void fetchAllAccountsAndBalance() {
		List<WebElement> accounts = allAccounts;
		System.out.println("All Accounts and Available balance in the account are below:");
		System.out.println("Total accounts found: " + accounts.size());
		for (int i = 0; i < accounts.size(); i++) {
			System.out.println(accounts.get(i).getText() + " ");
		}

		System.out.println();
	}

	public void logOut()
	 {
	   	 clickLogOut.click();
	 }
		 
	 	 
	 
	
}
