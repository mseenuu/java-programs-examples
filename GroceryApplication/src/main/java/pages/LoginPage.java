package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	public WebDriver driver;

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement userNameField;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement paswordField;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement signIn;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);// initialize webelements

	}

	public void enterTheUsername(String userName) {

		userNameField.sendKeys(userName);

	}

	public void enterThePassword(String password) {
		paswordField.sendKeys(password);

	}

	public void clickOnSignInButton() {

		signIn.click();

	}
	
//	public void login(String user, String pass) {
//		username.sendKeys(user);
//		password.sendKeys(pass);
//		signIn.click();
//	}

}
