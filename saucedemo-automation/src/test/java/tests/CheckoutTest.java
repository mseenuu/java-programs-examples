package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest {

    @Test
    public void checkoutFlowTest() {

        login();

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        driver.findElement(By.id("checkout")).click();
//        try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

        driver.findElement(By.id("first-name")).sendKeys("Seenu");
        driver.findElement(By.id("last-name")).sendKeys("M");
        driver.findElement(By.id("postal-code")).sendKeys("69561");
        
//        driver.findElement(By.name("firstName")).sendKeys("Seenu");
//        driver.findElement(By.name("lastName")).sendKeys("M");
//        driver.findElement(By.name("postalCode")).sendKeys("695601");

        driver.findElement(By.id("continue")).click();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.findElement(By.id("finish")).click();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        String msg = driver.findElement(By.className("complete-header")).getText();

        Assert.assertEquals(msg, "Thank you for your order!");
    }

    public void login() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }
}