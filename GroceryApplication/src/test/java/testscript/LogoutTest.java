package testscript;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LogoutPage;

public class LogoutTest extends Base {
	
	@Test(priority=1,description="logout testcase")

	public void verifyLogout() {
		 LoginPage login = new LoginPage(driver);
	        login.enterTheUsername("admin");
	       
	        login.enterThePassword("admin");
	        login.clickOnSignInButton();

	        LogoutPage logout = new LogoutPage(driver);
	        logout.logoutFromApplication();
}
}
