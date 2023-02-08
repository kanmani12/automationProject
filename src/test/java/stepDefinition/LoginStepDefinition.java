package stepDefinition;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@RunWith(Cucumber.class)
public class LoginStepDefinition {
	  @Given("^User on Home Landing page$")
	    public void user_on_home_landing_page() throws Throwable {
	       System.out.println("Landing page");
	    }

	 @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
	    System.out.println(strArg1);
	    System.out.println(strArg2);
	    }
	 @When("^User login in to application with (.+) and password (.+)$")
	    public void user_login_into_application_with_and_password(String username, String password) throws Throwable {
		   System.out.println(username);
	       System.out.println(password);
	    }

	
	    @Then("^User Home page is populated$")
	    public void user_home_page_is_populated() throws Throwable {
	     System.out.println("User home page");
	    }
	    @Then("^User Home page is not populated$")
	    public void user_home_page_is_not_populated() throws Throwable {
	       
	    }



}
