package STEPDEFINITION;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PAGEOBJECT.Googlesearch;
import cucumber.api.java.en.*;
import junit.framework.Assert;

public class steps1 {
	
	public WebDriver driver;
	
	public Googlesearch GS;
	
	@Given("^user lauch the browser$")
	public void user_lauch_the_browser() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C://MANIKANDAN//SELENIUM PACKAGES//chromedriver_win32/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		GS = new Googlesearch(driver);
		
		
	   
	}

	@Given("^user is on google search page$")
	public void user_is_on_google_search_page() throws Throwable {
		
		driver.get("https://www.google.co.in/");
	   
	}

	@When("^user enter the text in search page$")
	public void user_enter_the_text_in_search_page() throws Throwable {
		
		GS.setsearchbox("selenium  tool");
		
	  
	}

	@Then("^click on search button$")
	public void click_on_search_button() throws Throwable {
		
		GS.clicksearchbtn();
	   
	}



	@Then("^click on navigate page$")
	public void click_on_navigate_page() throws Throwable {
		
		GS.clickonnavigationlink();
		
		
	   
	}

	@Then("^Veriy the title of the page$")
	public void veriy_the_title_of_the_page() throws Throwable {
		
String title = driver.getTitle();
		
		Assert.assertEquals(title, "The Selenium project and tools :: Documentation for Selenium");
		
	
	   
	}
	
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	
	}
}
