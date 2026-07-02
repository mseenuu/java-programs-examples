package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;



public class CheckoutPage extends BasePage {

    public CheckoutPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "first-name")
    WebElement firstName;

    @FindBy(id = "last-name")
    WebElement lastName;

    @FindBy(id = "postal-code")
    WebElement postalCode;

    @FindBy(id = "continue")
    WebElement continueBtn;

    @FindBy(id = "finish")
    WebElement finishBtn;

    @FindBy(className = "title")
    WebElement title;

    @FindBy(className = "complete-header")
    WebElement successMsg;

    public void enterDetails(String f, String l, String p) {
        type(firstName, f);
        type(lastName, l);
        type(postalCode, p);
    }

    public void continueCheckout() {
        click(continueBtn);
    }

    public void finish() {
        click(finishBtn);
    }

    public String getTitle() {
        return getText(title);
    }

    public String getSuccessMessage() {
        return getText(successMsg);
    }
}