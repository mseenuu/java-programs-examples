package tests;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ProductsPage;



public class FailedValidationTest {

    @Test
    public void failTest() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        LoginPage login = new LoginPage(driver);
        ProductsPage products = new ProductsPage(driver);

        login.login("standard_user", "secret_sauce");

        // intentional failure
        Assert.assertEquals(products.getTitle(), "Home Page");

        driver.quit();
    }
}
