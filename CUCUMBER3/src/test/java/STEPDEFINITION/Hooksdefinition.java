package STEPDEFINITION;



import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class Hooksdefinition {
	
	@Before
	public void setUP() {
		
		System.out.println("Launch the chrome browser");
		System.out.println("Enter the url of CRM app");
	}
	
	
	@After
	public void tearDown() {
		
		System.out.println("close the browser");
	}
	
	
	@Given("^user on deal page$")
	public void user_on_deal_page() throws Throwable {
		
		System.out.println("User is on deal");
	   
	}

	@When("^fills the deal form$")
	public void fills_the_deal_form() throws Throwable {
		
		System.out.println("fill the deal");
	    
	}

	@Then("^deal is created$")
	public void deal_is_created() throws Throwable {
		
		System.out.println("Create a deal");
	 
	}
	
	
	
	
	
	@Given("^user on contact page$")
	public void user_on_contact_page() throws Throwable {
		
		System.out.println("user is on contact");
	    
	}

	@When("^fills the contact form$")
	public void fills_the_contact_form() throws Throwable {
		System.out.println("fill the contact");
	    
	}

	@Then("^contact is created$")
	public void contact_is_created() throws Throwable {
		
		System.out.println("contact is created");
	}


}
