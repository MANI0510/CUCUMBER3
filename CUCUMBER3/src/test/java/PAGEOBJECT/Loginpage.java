package PAGEOBJECT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UTILITIES.Waithelp;



public class Loginpage {
	
	public WebDriver ldriver;
	
	Waithelp waithelper;
	
	public Loginpage(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
		waithelper = new Waithelp(ldriver);
	}
	
	@FindBy(xpath ="/html/body/div[1]/header/div/nav/div[2]/div/a")
	@CacheLookup
	WebElement loginbtn;
	
	@FindBy(name = "email")
	@CacheLookup
	WebElement txtusername;
	
	@FindBy(name = "password")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
	@CacheLookup
	WebElement login;
	
	//Action methods
	
	public void clickonlogin() {
		
		waithelper.waitforelement(loginbtn,30);
		loginbtn.click();
		
		}
	
	public void setusername(String uname) {
		
		waithelper.waitforelement(txtusername,30);
		txtusername.sendKeys(uname);
	}
	
  public void setpassword(String pwd) {
		
	  waithelper.waitforelement(txtpassword,30);
		txtpassword.sendKeys(pwd);
	}
  
  public void loginbutton() {
	  
	  waithelper.waitforelement(login,30);
	  login.click();
		
		
	}
  
}
	
	

