package utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	
	public void dropdownVisibleText(WebElement element,String visibleText) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
	}
	
	//Dropdown - Select by Value
		public void dropdownValue(WebElement element,String value) {
			Select select = new Select(element);
			select.selectByValue(value);
		}
		
		//Dropdown - Select by Index
		public void dropdownIndex(WebElement element,int index) {
			Select select = new Select(element);
			select.selectByIndex(index);
		}
	
	//for alert
	//for all action class
	
	//Right Click
		public void rightClick(WebDriver driver,WebElement element) {
			Actions action = new Actions(driver);
			action.contextClick(element).perform();
		}
		
		//Double Click
		public void doubleClick(WebDriver driver,WebElement element) {
			Actions action = new Actions(driver);
			action.doubleClick(element).perform();
		}
		
		//Mouse Hover
		public void mouseHover(WebDriver driver,WebElement element) {
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();
		}
		
		//Drag and Drop
		public void dragAndDrop(WebDriver driver,WebElement source,WebElement target) {
			Actions action = new Actions(driver);
			action.dragAndDrop(source, target).perform();
		}
		
		//Alert Accept
		public void alertAccept(WebDriver driver) {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}
		

}
