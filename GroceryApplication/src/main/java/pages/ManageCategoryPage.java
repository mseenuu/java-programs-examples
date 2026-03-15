package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManageCategoryPage {

	// p[contains(text(),'Manage
	// Category')]//ancestor::div[contains(@class,'small-box')]//a
	
	public WebDriver driver;

	@FindBy(xpath = "//p[contains(text(),'Manage Category')]//ancestor::div[contains(@class,'small-box')]//a")
	WebElement moreInfo;

	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	WebElement newButton;

	@FindBy(xpath = "//input[@id='category']")
	WebElement category;

	@FindBy(xpath = "//li[@id='134-selectable']")
	WebElement discountGroup;

	@FindBy(xpath = "//button[@name='create']")
	WebElement saveButton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement successAlert;

	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	WebElement alreadyExistAlert;
	
	public ManageCategoryPage(WebDriver driver)
	{
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	}

//	public ManageCategoryPage() {
//		// TODO Auto-generated constructor stub
//	}

	public void clickMoreInfo() {
		moreInfo.click();
	}

	public void clickNewButton() {
		newButton.click();
	}

	public void enterCategory(String cat) {
		category.sendKeys(cat);
	}

	public void selectDiscountGroup() {
		discountGroup.click();
	}

	public void clickSave() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", saveButton);

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(saveButton));

	    saveButton.click();
	}

	public String getSuccessAlert() {
		return successAlert.getText();
	}

	public String getAlreadyExistAlert() {
		return alreadyExistAlert.getText();
	}

}