package STEPDEFINITION;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;
import junit.framework.Assert;

public class Step2 {
	
	/*public WebDriver driver;
	
	
	@Given("^User launch the browser$")
	public void user_launch_the_browser() throws Throwable {
		
		System.setProperty("webdriver.gecko.driver","C://MANIKANDAN//SELENIUM PACKAGES//gekodriver/geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}

	@When("^User enter the url$")
	public void user_enter_the_url() throws Throwable {
		
		driver.get("https://example.testproject.io/web/");
		
	   
	}
	
	
	@Then("^User enter the username and password$")
	public void user_enter_the_username_and_password(DataTable data) throws Throwable {
		
       List<List<String>> value = data.raw();
		
		driver.findElement(By.id("name")).sendKeys(value.get(0).get(0));
		driver.findElement(By.id("password")).sendKeys(value.get(0).get(1));
		
		Thread.sleep(3000);
	  
	}



	/*@Then("^User enter the username and pasword$")
	public void user_enter_the_username_and_password(DataTable data) throws Throwable {
		
		List<List<String>> value = data.raw();
		
		driver.findElement(By.id("name")).sendKeys(value.get(0).get(0));
		driver.findElement(By.id("password")).sendKeys(value.get(0).get(1));
		
		Thread.sleep(3000);
	    
	}*/

	/*@Then("^click on login button$")
	public void click_on_login_button() throws Throwable {
	    
		
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
	}

	@Then("^verify the apge title$")
	public void verify_the_apge_title() throws Throwable {
		
		String title = driver.getTitle();
		
		Assert.assertEquals(title, "TestProject Demo");
	    
	}
	
	
	@Then("^user select the country$")
	public void user_select_the_country() throws Throwable {
		
	   WebElement dropdown = driver.findElement(By.xpath("//select[@id='country']"));
	   
	   Select se = new Select(dropdown);
	   
	   se.selectByVisibleText("India");
	  
	}

	/*@Then("^User enter \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and_and(String gmail, String address, String phone) throws Throwable {
		
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys(gmail);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(address);
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(phone);
		
		
	  
	}*/
	
	

/*@Then("^User enter contact details$")
public void user_enter_contact_details(DataTable credentials) throws Throwable {
	
	List<List<String>> data = credentials.raw();
	
	driver.findElement(By.xpath("//input[@id='address']")).sendKeys(data.get(0).get(0));
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(data.get(0).get(1));
	driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(data.get(0).get(2));
    
}

	@Then("^User click on save button$")
	public void user_click_on_save_button() throws Throwable {
		
		driver.findElement(By.xpath("//button[@id='save']")).click();
	    
	}

	@Then("^verify the page title$")
	public void verify_the_page_title() throws Throwable {
		
		driver.findElement(By.xpath("//button[@id='logout']")).isEnabled();
		
		System.out.println("test case passed");
	   
	}

	@Then("^closing the browser$")
	public void closing_the_browser() throws Throwable {
		
		driver.quit();
	   
	}*/

}
