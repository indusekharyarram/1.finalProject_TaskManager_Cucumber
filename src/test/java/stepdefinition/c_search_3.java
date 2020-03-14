package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.c_searching;

public class c_search_3 {
	c_searching enter=new c_searching();
	@Given("^open the browser$")
	public void open_the_browser() throws Throwable {
		enter.launch2_c();
	}

	@When("^access TaskManager website and click on Task List$")
	public void access_TaskManager_website_and_click_on_Task_List() throws Throwable {
		enter.open2_c();
	}

	@Then("^Search for the tasks$")
	public void search_for_the_tasks() throws Throwable {
		enter.filter_c();
	}

	@Then("^click on Search button$")
	public void click_on_Search_button() throws Throwable {
		enter.click2_c();
	}
}
