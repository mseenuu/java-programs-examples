package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginNegativeTest extends BaseTest {

    @Test
    public void invalidLoginTest() throws InterruptedException {

        driver.findElement(By.id("user-name")).sendKeys("wrong_user");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("wrong_pass");
        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);

        String error = driver.findElement(By.cssSelector("[data-test='error']")).getText();

        Assert.assertTrue(error.contains("Username and password do not match"));
    }
}
