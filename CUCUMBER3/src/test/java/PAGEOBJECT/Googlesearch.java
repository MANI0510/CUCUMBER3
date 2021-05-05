package PAGEOBJECT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class Googlesearch {
	
	public WebDriver ldriver;
	
	public Googlesearch(WebDriver rdriver) {
		
		ldriver = rdriver;
		
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(how=How.NAME,using="q")
	@CacheLookup
	WebElement Searchbox;
	
	@FindBy(how=How.XPATH,using="//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]")
	@CacheLookup
	WebElement Searchbutton;
	
	@FindBy(how=How.XPATH,using="//h3[contains(text(),'The Selenium project and tools :: Documentation fo')]")
	@CacheLookup
	WebElement clicknavigation;
	
	public void setsearchbox(String name) {
		
		Searchbox.sendKeys(name);
	}
	
	public void clicksearchbtn() {
		Searchbutton.click();
	}
	
	public void clickonnavigationlink() {
		
		clicknavigation.click();
	}
	
	
		
	
	
	
	

}
