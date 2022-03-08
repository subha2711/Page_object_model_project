package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;

import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {

	WebDriver driver;
	@Test
	public void validUserShouldBeAbleToCreateCustomer() {
		
		driver = BrowserFactory.init();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName("demo@techfios.com");
		loginPage.password("abc123");
		loginPage.signinButton();
		
		DashBoardPage dashBoard = PageFactory.initElements(driver, DashBoardPage.class);
		dashBoard.verifyDashBoardPage();
		dashBoard.clickCustomersButton();
		dashBoard.AddCustomersButton();
		
		AddCustomerPage addCustomer = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomer.verifyAddContactPage();
		addCustomer.enterFullname("John David");
		addCustomer.selectCompany("Techfios");
		addCustomer.enterEmail("johndavid@abc.com");
		
	//	BrowserFactory.tearDown();
	}
}
