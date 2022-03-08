package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver ) {
		this.driver= driver;
	}
	/*
	 * By userNameField =By.xpath("//input[@id='username']"); By passwordField
	 * =By.xpath("//input[@id='password']"); By signinButtonField
	 * =By.xpath("//button[@name='login']");
	 */
	
	@FindBy(how = How.XPATH , using ="//input[@id='username']" )WebElement userName_Element;
	@FindBy(how = How.XPATH , using = "//input[@id='password']") WebElement password_Element;
	@FindBy(how = How.XPATH , using = "//button[@name='login']") WebElement signinButton_Element;

	// Interactive Methods
	 
	public void enterUserName(String userName) {
		userName_Element.sendKeys(userName);	
	}
	
	public void password(String password) {
		password_Element.sendKeys(password);	
	}

	public void signinButton() {
		signinButton_Element.click();	
	}
	
	//Combined method
	public void testLoginData(String userName, String password) {
		userName_Element.sendKeys(userName);
		password_Element.sendKeys(password);
		signinButton_Element.click();
	}
}
