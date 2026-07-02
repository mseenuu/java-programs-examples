package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    @Test
    public void addToCartTest() {

        login();

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        String count = driver.findElement(By.className("shopping_cart_badge")).getText();
        Assert.assertEquals(count, "1");

        driver.findElement(By.className("shopping_cart_link")).click();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        Assert.assertTrue(driver.findElement(By.className("inventory_item_name")).isDisplayed());
    }

    public void login() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }
}
