package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddCustomerPage extends BasePage{

	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Add Contact')]")	WebElement AddContactPage_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='account']")WebElement FullName_Field;
	@FindBy(how = How.XPATH, using = "//select[@id='cid']")WebElement company_Field;
	@FindBy(how = How.XPATH, using = "//*[@id='email']")WebElement email_Field;

	public void verifyAddContactPage() {
		Assert.assertEquals(AddContactPage_Field.getText(), "Add Contact", "Not on rightPage");
	}
	
	public void enterFullname(String fullname) {
		waitForElement(driver, 10, FullName_Field);
		FullName_Field.sendKeys(fullname + generateNumber(500));
	}
	

	public void selectCompany(String dropDownValue) {
		selectDropDown(company_Field, dropDownValue);
	}
	public void enterEmail(String email) {
		email_Field.sendKeys(generateNumber(500) + email);
	}
}
