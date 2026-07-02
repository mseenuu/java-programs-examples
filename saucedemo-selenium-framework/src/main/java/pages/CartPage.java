package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;



public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "inventory_item_name")
    WebElement product;

    @FindBy(id = "checkout")
    WebElement checkoutBtn;

    public String getProductName() {
        return getText(product);
    }

    public void checkout() {
        click(checkoutBtn);
    }
}
