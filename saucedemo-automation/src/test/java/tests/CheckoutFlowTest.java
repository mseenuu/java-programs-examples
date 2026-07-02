package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

	public class CheckoutFlowTest extends BaseTest {

	    @Test
	    public void checkoutFlowTest() {

	        // 🔐 Login
	        driver.findElement(By.id("user-name")).sendKeys("standard_user");
	        driver.findElement(By.id("password")).sendKeys("secret_sauce");
	        driver.findElement(By.id("login-button")).click();

	        // 🛒 Add product to cart
	        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

	        // 🛍 Open cart
	        driver.findElement(By.className("shopping_cart_link")).click();

	        // 💳 Click checkout
	        driver.findElement(By.id("checkout")).click();

	        // 🧾 Enter user details (UPDATED)
	        driver.findElement(By.id("first-name")).sendKeys("Seenu");
	        driver.findElement(By.id("last-name")).sendKeys("Mahendran");
	        driver.findElement(By.id("postal-code")).sendKeys("12345");

	        // Continue checkout
	        driver.findElement(By.id("continue")).click();

	        // Finish order
	        driver.findElement(By.id("finish")).click();

	        // ✅ Validate success message
	        String actualMessage = driver.findElement(By.className("complete-header")).getText();

	        Assert.assertEquals(actualMessage, "Thank you for your order!");

	        System.out.println("Checkout flow completed successfully.");
	    }
	}
