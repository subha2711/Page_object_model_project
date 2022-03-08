package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {

	WebDriver driver;

	@Test
	public void validUserShouldBeAbleToLogin() {
		driver = BrowserFactory.init();

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		loginPage.enterUserName("demo@techfios.com");
		loginPage.password("abc123");
		loginPage.signinButton();
		
		DashBoardPage dashBoard = PageFactory.initElements(driver, DashBoardPage.class);
		
		dashBoard.verifyDashBoardPage();

		BrowserFactory.tearDown();
	}
}
