package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.d_print;

public class d_print_4 {
	d_print enter=new d_print();
	@Given("^Open the browser$")
	public void open_the_browser() throws Throwable {
		enter.launch3();
	}

	@When("^Access TaskManager website$")
	public void access_TaskManager_website() throws Throwable {
		enter.open3();
	  
	}

	@Then("^open the tasks$")
	public void open_the_tasks() throws Throwable {		

	}

	@Then("^print the tasks$")
	public void print_the_tasks() throws Throwable {	
		enter.print();
	}
}
