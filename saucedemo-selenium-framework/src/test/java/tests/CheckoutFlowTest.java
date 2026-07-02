package tests;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutFlowTest {

    @Test
    public void checkoutTest() {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();

        // Open application
        driver.get("https://www.saucedemo.com/");

        // Login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Add product
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        // Open cart
        driver.findElement(By.className("shopping_cart_link")).click();

        // Click checkout
        driver.findElement(By.id("checkout")).click();

        // Enter details
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first-name")));

        driver.findElement(By.id("first-name")).sendKeys("Seenu");
        driver.findElement(By.id("last-name")).sendKeys("Mahendran");
        driver.findElement(By.id("postal-code")).sendKeys("695601");

        // Continue
        driver.findElement(By.id("continue")).click();

        // ✅ WAIT FOR OVERVIEW PAGE
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("title")));

        // Verify Overview page
        String overviewTitle = driver.findElement(By.className("title")).getText();
        Assert.assertEquals(overviewTitle, "Checkout: Overview");

        // Finish order
        driver.findElement(By.id("finish")).click();

        // Verify success message
        String successMsg = driver.findElement(By.className("complete-header")).getText();
        Assert.assertEquals(successMsg, "Thank you for your order!");

        driver.quit();
    }
}