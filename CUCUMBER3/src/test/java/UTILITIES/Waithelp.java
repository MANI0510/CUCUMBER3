package UTILITIES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waithelp {
	
	public WebDriver driver;
	
	public Waithelp(WebDriver driver) {
	
	this.driver = driver;

}
	public void waitforelement(WebElement element,long timeUnitInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver,timeUnitInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
				
				
		
		
	}


}
