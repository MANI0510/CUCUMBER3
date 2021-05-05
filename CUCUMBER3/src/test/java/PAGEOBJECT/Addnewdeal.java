package PAGEOBJECT;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import UTILITIES.Waithelp;

public class Addnewdeal {
	
	public WebDriver ldriver;

	
	
	
	
	public Addnewdeal(WebDriver rdriver) {
		
		ldriver = rdriver;
		
		PageFactory.initElements(ldriver, this);
		
	}
	
	By menu_item = By.xpath("//*[@id=\"main-nav\"]/div[5]/a/i");
	
	
	By addbutton = By.xpath("//div[5]//button[1]//i[1]");
	
	By title = By.name("title");
	
    By access = By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[1]/div[2]/div/div/div[1]/button"); 
	   
	By access1 =By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[1]/div[2]/div/div/div[2]/div/div[1]");
	
	  By accessselection = By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[1]/div[2]/div/div/div[2]/div/div[2]/div");
	   By company = By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[2]/div[2]/div/div/input");
	   
	   By clickoncompany = By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[2]/div[2]/div/div/div/div");
	   
	   
	   By contacts = By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[3]/div[2]/div/div/input");   
	   
	   By clickoncontact = By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[3]/div[2]/div/div/div/div");
	   
	   By tag = By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[4]/div[2]/div/label[2]/div/input");  
	   
	   By clcikontagname = By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[4]/div[2]/div/label[2]/div/div/div");
	
	   
	 
	By Assigned_to = By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[2]/div[1]/div/div");
	
	By select = By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[2]/div[1]/div/div/div[2]/div");
	
	
	
	By products = By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[3]/div[1]/div/div/input");
	
	By productselect = By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[3]/div[1]/div/div/div/div");
	
	
	
	By closedate = By.xpath(" //*[@id=\"main-content\"]/div/div[2]/form/div[4]/div[1]/div/div[1]/div/input"); 
	
	By month_year = By.xpath("//div[@class='react-datepicker__current-month']");
	
	By arrowbutton = By.xpath("//button[@class='react-datepicker__navigation react-datepicker__navigation--previous']");
	
	By date = By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[4]/div[1]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[6]");
	
	By time =By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[4]/div[1]/div/div[2]/div[2]/div/div/div[3]/div[2]/div/ul/li[53]");
	
   By description = By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[5]/div[1]/div/textarea"); 
   
   By amount = By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[6]/div[1]/div/div/input");
   
   By stage = By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[7]/div[1]/div/div");
   
   By stageselection = By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[7]/div[1]/div/div/div[2]/div[5]");
   
   By status = By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[8]/div[1]/div/div");
   
   By statusselection = By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[8]/div[1]/div/div/div[2]/div[2]");
   
   By type = By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[9]/div[1]/div/div");
   
   By typeselection = By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[9]/div[1]/div/div/div[2]/div[2]");
   
   By identifier = By.xpath("//input[@name='identifier']");
   By probability = By.xpath("//input[@name ='probability']");
   
   By commission = By.xpath("//input[@name ='commission']");
   
   By clodestag = By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[7]/div[2]/div/div/label");
   
   By next_step = By.xpath("//textarea[@name='next_step']");
   
   By source = By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[9]/div[2]/div/div"); 
   
   By sourceselection = By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[9]/div[2]/div/div/div[2]/div[6]");
   
   By savebutton = By.xpath("//i[@class='save icon']");
   
   
   
   public void clickonmenuitem() throws InterruptedException {  
	   
	
	  
	 Thread.sleep(3000); 
	 
	  ldriver.findElement(menu_item).click();
	  

	 }
   
   public void clcikonaddnewdealbutton() throws InterruptedException {
	   

	   Thread.sleep(3000);
	   
	   ldriver.findElement(addbutton).click();
	   
   }
   
   public void settitle(String titlename) throws InterruptedException {
	   
	   ldriver.findElement(title).sendKeys(titlename);
	   
	   Thread.sleep(3000);
   }
   
   
   public void setaccess() throws InterruptedException {
   	
   	
   	
   	ldriver.findElement(access).click();
   	
   	Thread.sleep(3000);
   }
   
   public void setaccessname() {
   	
   	ldriver.findElement(access1).click();
   }
   
   public void clickaccessselection() {
   	
   	ldriver.findElement(accessselection).click();
   }
   
   public void setcompany(String cname) {
   	
   	ldriver.findElement(company).sendKeys(cname);
   	
   }
   
   public void clickoncompanyname() throws InterruptedException {
   	
   	ldriver.findElement(clickoncompany).click();
   	
   	Thread.sleep(3000);
   }
   
   public void setcontacts(String con) throws InterruptedException {
   	
   	ldriver.findElement(contacts).sendKeys(con);
   	
   	Thread.sleep(3000);
   }
   
   public void clickcontactname() throws InterruptedException {
   	
   	ldriver.findElement(clickoncontact).click();
   	
   	Thread.sleep(3000);
   }
  
   public void settag(String name) throws InterruptedException {
   	
   	ldriver.findElement(tag).sendKeys(name);
   	
   	Thread.sleep(3000);
   }
   
   public void clicktagname() throws InterruptedException {
   	ldriver.findElement(clcikontagname).click();
   	
   	Thread.sleep(3000);
   }
   
   public void setassigned() throws InterruptedException {
	   
	   ldriver.findElement(Assigned_to).click();
	   
	   Thread.sleep(3000);
   }
   
   public void setselect() throws InterruptedException {
	   
	   ldriver.findElement(select).click();
	   
	   Thread.sleep(3000);
   }
	   
	   
	   
	 
   
  
   
   public void setproducts(String pname) throws InterruptedException {
	   
	   ldriver.findElement(products).sendKeys(pname);
	   
	   Thread.sleep(3000);
	   
   }
	
   public void clickproductselect() {
	   
	   ldriver.findElement(productselect).click();
   }
 
   
   public void dateselection() {
	   
	   while(true) {
	   ldriver.findElement(closedate).click();
	   
	   String date1 = ldriver.findElement(month_year).getText();
	   
	   System.out.println(date1);
	   
	   if(date1.equals("May 2018")){
		   
		   break;
	   }
	   
	   else {
		   
		   ldriver.findElement(arrowbutton ).click();
	   }
		   
		   
		    }
	  }
   
   public void setdate() {
	   
	   ldriver.findElement(date).click();
   }

   public void timeselection() {
	
	 ldriver.findElement(time).click();
}

   public void descriptionmenu(String des) {
	
	ldriver.findElement(description).sendKeys(des);
	
}

   public void setamount(String amt) {
	
	ldriver.findElement(amount).sendKeys(amt);
}
   
   public void setstage() {
	   
	ldriver.findElement(stage).click();
   }
   
   public void setstageselection() {
	   
	   ldriver.findElement(stageselection).click();
	
	 }
   
   
   public void setstatus() throws InterruptedException {
	   
	   ldriver.findElement(status).click();
   }
   
   public void setstatuselection() {
	   
	   ldriver.findElement(statusselection).click();
	   
		
	}
   
  public void settype() throws InterruptedException {
	  
	  ldriver.findElement(type).click();
  }
  
  public void settypeselection() {
	 
	  ldriver.findElement(typeselection).click();
	   
	  
	  }
  
  public void setidentifier(String identity) throws InterruptedException {
	  
	  ldriver.findElement(identifier).sendKeys(identity);
	  
	  Thread.sleep(8000);
  }
   
 
  
    public void setprobability(String percent) {
    	
    	ldriver.findElement(probability).sendKeys(percent);
    }
   
   public void setcommisson(String value1) {
    	
    	ldriver.findElement(commission).sendKeys(value1);
    }
   
   public void setclosed() {
   	
   	ldriver.findElement(clodestag).click();
   }
   
   public void setnextsteps(String cmt) {
	   
	   ldriver.findElement(next_step).sendKeys(cmt);
   }
   
   public void setsource() throws InterruptedException {
	   
	  ldriver.findElement(source).click();
	  
   }
   
   public void setsourceselection() {
	   
	   ldriver.findElement(sourceselection).click();
	   
   }
	  
	  
	  
	  
	 
   
   
   public void clickonsavebutton() {
	   
	   ldriver.findElement(savebutton).click();
   }
  
   
   
   
   
  



	
	
}


