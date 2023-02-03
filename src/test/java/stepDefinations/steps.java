package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.accountOverviewPage;
import pages.accountPage;
import pages.loginPage;

public class steps extends BaseClass{
	
	@Given("Open the browser")
	public void open_the_browser() {
	    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    //driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}

	@When("Enter the URL {string}")
	public void enter_the_url(String url) throws InterruptedException {
	    driver.get(url);
	    Thread.sleep(2000);
	}

	@And("^Enter registered (.*) and (.*)$")
	public void enter_registered_username_and_password(String username, String password) throws Throwable
	{
		login = new loginPage(driver);
		
		login.enterUsername(username);
		Thread.sleep(2000);
		
		login.enterPassword(password);
		Thread.sleep(2000);
	}

	@And("Click on login button")
	public void click_on_login_button() 
	{
		login.clickOnLogin();
		//driver.findElement(By.xpath("//input[@value='Log In']")).click();    
	}

	@Then("User must successfully login to the Account page")
	public void user_must_successfully_login_to_the_Account_page() throws InterruptedException {
		String expectedPageTitle = "ParaBank | Accounts Overview";
		String actualPageTitlte=driver.getTitle();
		Assert.assertTrue(actualPageTitlte.equalsIgnoreCase(expectedPageTitle));
Thread.sleep(2000);	
}
	@When("User click on Open New Account")
	public void user_click_on_open_new_account() throws InterruptedException {
		account = new accountPage(driver);
		account.clickOpenNewAccount();
	  Thread.sleep(2000);
	}

	@And("User should select the Account type")
	public void user_should_select_the_account_type() {
		account.selectAccountType();
	  
	}

	@And("User should select existing account to tranfer fund to new account")
	public void user_should_select_existing_account_to_tranfer_fund_to_new_account() {
	    account.selectTransferAccount();
	}

	@And("Click on open new account")
	public void click_on_open_new_account() throws InterruptedException {
	    account.submitOpenNewAccountButton();
	}

	@Then("User can view New account opened message {string}")
	public void user_can_view_new_account_opened_message(String string) {
	 account.verifyAccountOpened();
	}
	@When("click on accounts overview")
	public void click_on_accounts_overview() throws InterruptedException {
		accountOverview = new accountOverviewPage(driver);
		accountOverview.clickAccountsOverview();
		Thread.sleep(2000);
	}

	@When("user should fetch all accounts and available balance")
	public void user_should_fetch_all_accounts_and_available_balance() {
	    accountOverview.fetchAllAccountsAndBalance();
	}

	@Then("Logout of the application")
	public void logout_of_the_application() {
	    accountOverview.logOut();
	}

	@Then("close browser")
	public void close_browser() {
	    driver.quit();
	}

	}
	
