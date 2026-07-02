package tests;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ProductsPage;



public class LoginTest {

    @Test
    public void loginTest() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        LoginPage login = new LoginPage(driver);
        ProductsPage products = new ProductsPage(driver);

        login.login("standard_user", "secret_sauce");

        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
        Assert.assertEquals(products.getTitle(), "Products");

        driver.quit();
    }
}
