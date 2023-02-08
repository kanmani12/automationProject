package stepDefinition;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class Register {

	  @Given("^User on Home Landing page for Register$")
	    public void user_on_home_landing_page_for_register() throws Throwable {
	       System.out.println("User on Landing page click register button");
	    }

	    @When("^User Register into application with followin details$")
	    public void user_register_into_application_with_followin_details(DataTable data) throws Throwable {
	        System.out.println("user given details");
	     
	        	List<List<String>> obj=data.asLists();
	       //  System.out.println(obj.get(0).get(0));
	        //System.out.println(obj.get(1));
	        for(int i=0;i<obj.size();i++)
	        {
	        	for(int j=0;j<5;j++)
	        	{
	        		System.out.println(obj.get(i).get(j));
	        	}
	        }
	        
	    }

	    @Then("^User Need to  register success$")
	    public void user_need_to_register_success() throws Throwable {
	        System.out.println("register sucess");
	    }

	    @And("^It should display Message user register successfully$")
	    public void it_should_display_message_user_register_successfully() throws Throwable {
	       System.out.println("Confirm message & go to login page");
	    }
	   
}
