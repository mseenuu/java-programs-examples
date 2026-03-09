package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManageNewsPage {

	// a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and
	// @class='small-box-footer']

	public WebDriver driver;

//	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and  @class='small-box-footer']")
//	WebElement moreInfo;
	
	@FindBy(xpath = "//a[contains(@href,'list-news') and @class='small-box-footer']")
	WebElement moreInfo;

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newButton;

	@FindBy(xpath = "//textarea[@id='news']")
	WebElement newsTextArea;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement saveButton;	
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alertMessage;

	public ManageNewsPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);// initialize webelements

		
	}

	public void moreInfo() {
		moreInfo.click();
	}

	public void newButton() {
		newButton.click();

	}

	public void enterNewsText(String newsText) {
		newsTextArea.sendKeys(newsText);
	}

	public void clickSaveButton() {
		saveButton.click();
	}
	
	public boolean isAlertDisplayed() {
		return alertMessage.isDisplayed();
	}
	
	public String getAlertText() {
		return alertMessage.getText();
	}

}
