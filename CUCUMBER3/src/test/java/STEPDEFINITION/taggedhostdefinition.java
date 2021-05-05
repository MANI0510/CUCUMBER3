package STEPDEFINITION;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class taggedhostdefinition {
	
	@Before
	public void setUP() {
		
		System.out.println("Launch the chrome browser");
		System.out.println("Enter the url of CRM app");
	}
	
	
	@After
	public void tearDown() {
		
		System.out.println("close the browser");
	}
	
	@Before(@First)
	
	public void beforeFirst() {
		
		System.out.println("before only first scenario");
	}
	
	@After(@First)
	
	public void afterFirst() {
		
		System.out.println("after only first scenario");
	}
	
	
@Before()
	
	public void beforeFirst() {
		
		System.out.println("before only first scenario");
	}
	
	@After()
	
	public void afterFirst() {
		
		System.out.println("after only first scenario");
	}
	
	
	
@Before()
	
	public void beforeFirst() {
		
		System.out.println("before only first scenario");
	}
	
	@After()
	
	public void afterFirst() {
		
		System.out.println("after only first scenario");
	}
	
	
	
	

}
