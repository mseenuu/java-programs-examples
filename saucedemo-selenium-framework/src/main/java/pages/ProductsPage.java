package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;



public class ProductsPage extends BasePage {

    public ProductsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "title")
    WebElement title;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addBackpack;

    @FindBy(className = "shopping_cart_badge")
    WebElement cartBadge;

    @FindBy(className = "shopping_cart_link")
    WebElement cartIcon;

    public String getTitle() {
        return getText(title);
    }

    public void addProduct() {
        click(addBackpack);
    }

    public String getCartCount() {
        return getText(cartBadge);
    }

    public void openCart() {
        click(cartIcon);
    }
}