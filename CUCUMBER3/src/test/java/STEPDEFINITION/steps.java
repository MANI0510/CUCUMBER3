package STEPDEFINITION;


    import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PAGEOBJECT.Addnewdeal;
import PAGEOBJECT.Loginpage;
import cucumber.api.java.en.*;

	public class steps {
		
		public WebDriver driver;
		
		public Loginpage lp;
		
		public Addnewdeal adddeal;
		
	
		
		
		
		
		@Given("^User Launch the browser$")
		public void user_Launch_the_browser() throws Throwable {
			
			System.setProperty("webdriver.chrome.driver","C://MANIKANDAN//SELENIUM PACKAGES//chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
			
			lp = new Loginpage(driver);
			
			driver.manage().window().maximize();
		    
		}

		@When("^User enter the URL \"([^\"]*)\"$")
		public void user_enter_the_URL(String url) throws Throwable {
			
			driver.get(url);
		   
		}

		@Then("^User click the login button$")
		public void user_click_the_login_button() throws Throwable {
			
			lp.clickonlogin();
			
		   
		}

		@Then("^User enter the email id$")
		public void user_enter_the_email_id() throws Throwable {
			
			lp.setusername("manikandanst05@gmail.com");
		   	
		}

		@Then("^User enter the email password$")
		public void user_enter_the_email_password() throws Throwable {
			
			lp.setpassword("Test@123");
		 
		}

		@Then("^User click on login button$")
		public void user_click_on_login_button() throws Throwable {
			
			lp.loginbutton();
		   
		}

		@Then("^User verify the loginpage$")
		public void user_verify_the_loginpage() throws Throwable {
			
			String title = driver.getTitle();
			
			Assert.assertEquals(title,"Cogmento CRM");
		    
		}
		
		
		
		
		//Add new deal
		

@When("^click on add button in new deal$")
public void click_on_add_button_in_new_deal() throws Throwable {  
	
	adddeal = new Addnewdeal(driver);
	
  adddeal.clickonmenuitem();
	
	
	

	
	adddeal.clcikonaddnewdealbutton();
	
	
    
}

@Then("^Enter the User info$")
public void enter_the_User_info() throws Throwable {
	
	adddeal.settitle("cogmento deal");
	
	adddeal.setaccess();
    adddeal.setaccessname();
    adddeal.clickaccessselection();
    
   
    adddeal.setcompany("ABC PVT LTD");
    adddeal.clickoncompanyname();
    adddeal.setcontacts("SHANKAAR");
    adddeal.clickcontactname();
    adddeal.settag("varun");
    adddeal.clicktagname();
    
	adddeal.setassigned();
	adddeal.setselect();
	
    adddeal.setproducts("BMW");
    
    adddeal.clickproductselect();
    adddeal.clickproductselect();
    

    adddeal.dateselection();
    adddeal.setdate();
    
    adddeal.timeselection();
    adddeal.descriptionmenu("I need this car very early");
    adddeal.setamount("800000");
    adddeal.setstage();
    adddeal.setstageselection();
    adddeal.setstatus();
    adddeal.setstatuselection();
    adddeal.settype();
    adddeal.settypeselection();
    
    adddeal.setidentifier("MANAGER");
    
    adddeal.setprobability("70");
    adddeal.setcommisson("200");
    
    adddeal.setclosed();
    adddeal.setnextsteps("we will come on tomorrow");
    adddeal.setsource();
    adddeal.setsourceselection();
    
    
   
    
    
    
    
}
@Then("^click on save button$")
public void click_on_save_button() throws Throwable {
	
	 adddeal.clickonsavebutton();
    
}

@Then("^veriy the page title$")
public void veriy_the_page_title() throws Throwable {
	
	String title = driver.getTitle();
	
	Assert.assertEquals(title,"Cogmento CRM");
    
}

@Then("^close teh browser$")
public void close_teh_browser() throws Throwable {
   
}
		
		
		
		/*@Then("^close the browser$")
		public void close_the_browser() throws Throwable {
		   
			driver.quit();
		}*/


		

	}


