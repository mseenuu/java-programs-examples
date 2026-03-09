package testscript;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;

public class ManageNewsTest extends Base{
	
	@Test
	
	public void clickMoreInfoButton() {
		
		LoginPage login = new LoginPage(driver);
		login.enterTheUsername("admin");
		login.enterThePassword("admin");
		login.clickOnSignInButton();
		
		ManageNewsPage  manageNewsPage = new ManageNewsPage(driver);
		manageNewsPage.moreInfo();
		manageNewsPage.newButton();
		manageNewsPage.enterNewsText("50% offer for all grocery items");
		manageNewsPage.clickSaveButton();
		
		if (manageNewsPage.isAlertDisplayed()) {
			System.out.println("Alert displayed: " + manageNewsPage.getAlertText());
		} else {
			System.out.println("Alert not displayed");
		}
		
		
		
		
	}

}
