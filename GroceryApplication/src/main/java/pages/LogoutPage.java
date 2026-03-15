package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	
	
	
	
	
	   WebDriver driver;

	    public LogoutPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    
	    @FindBy(xpath = "//a[@class='nav-link' and @data-toggle='dropdown']")
	    WebElement adminDropdown;

	    // Logout button
	    @FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']")
	    WebElement logoutButton;

	    public void logoutFromApplication()
	    {
	    	adminDropdown.click();   
	        logoutButton.click();  
	    }

}
