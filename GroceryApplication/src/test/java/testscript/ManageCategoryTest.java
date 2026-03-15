package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageCategoryPage;

public class ManageCategoryTest extends Base{
	
	@Test
    public void verifyAddCategory() {

        LoginPage login = new LoginPage(driver);
        login.enterTheUsername("admin");
		login.enterThePassword("admin");
		login.clickOnSignInButton();

		ManageCategoryPage categoryPage = new ManageCategoryPage(driver);

        categoryPage.clickMoreInfo();
        categoryPage.clickNewButton();
        categoryPage.enterCategory("Rice categories");
        categoryPage.selectDiscountGroup();
        categoryPage.clickSave();
        
        String success = categoryPage.getSuccessAlert();
        System.out.println(success);

        Assert.assertTrue(success.contains("Category Created"));
        
       

    }

}
