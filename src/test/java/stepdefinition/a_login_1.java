package stepdefinition;

import java.io.IOException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.a_login;

public class a_login_1 
{
a_login enter= new a_login();

	@Given("^launch the browser$")
	public void launch_the_browser() throws Throwable {
enter.launch();
	}

	@When("^open TaskManager website$")
	public void open_TaskManager_website() throws Throwable {
enter.open();
	}

	@Then("^enter Username and Password$")
	public void enter_Username_and_Password() throws IOException, InterruptedException {
		for(int i=1;i<4;i++)
		{
	        enter.Username_Password(i);
	       enter.click();
	        
	       if(i<3)
	        {
	        enter.launch();
	        enter.open();
		}
	        }
	}
	

	@Then("^click on Login button$")
	public void click_on_Login_button() throws Throwable {
		//enter.click();
/*enter.launch();
enter.open();*/
	}
	}

