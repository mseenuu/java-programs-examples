package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base{
	
	@Test

	public void verifyTheUserIsAbleToLoginWithValidCredentials() throws IOException {

//		String userName = "admin";
//		String password = "admin";

		
		String userName = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterTheUsername(userName);
		loginPage.enterThePassword(password);
		loginPage.clickOnSignInButton();

	}

	

}
