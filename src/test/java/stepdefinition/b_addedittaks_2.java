package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.a_login;
import pages.b_addedittask;

public class b_addedittaks_2 {
	b_addedittask enter= new b_addedittask();
	@Given("^Launch the website in a browser$")
	public void launch_the_website_in_a_browser() throws Throwable {
	enter.abcd();
	}

	@When("^Open TaskManager website and click on Add Task$")
	public void open_TaskManager_website_and_click_on_Add_Task() throws Throwable {
enter.Add_Task();
	}

	@Then("^Enter Required Fields$")
	public void enter_Required_Fields() throws Throwable {
enter.Add_Details();
	}

	@Then("^Select Start Date$")
	public void select_Start_Date() throws Throwable {
enter.StarDate();
	}

	@Then("^Select Finish Date$")
	public void select_Finish_Date() throws Throwable {
enter.EndDate();
	}

	@Then("^click  on Add button$")
	public void click_on_Add_button() throws Throwable {
enter.Send();
	}
}
