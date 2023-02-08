package stepDefinition;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class chat {
	@Given("^validate the login$")
    public void validate_the_login() throws Throwable {
        System.out.println("Before chat loging");
    }

    @Given("^Message box add button validation$")
    public void message_box_add_button_validation() throws Throwable {
        System.out.println("Msg box add button validation");
    }

    @Given("^User Enter in input$")
    public void user() throws Throwable {
        System.out.println(" User Enter input");
    }

    @When("^After user login application selected chat icon$")
    public void after_user_login_application_selected_chat_icon() throws Throwable {
       System.out.println("After user login application selected chat icon");
    }

    @When("^User clicks add button$")
    public void user_clicks_add_button() throws Throwable {
        System.out.println("User clicks add button");
    }

    @When("^User Enters the (.+) in the search box$")
    public void user_enters_the_in_the_search_box(String name) throws Throwable {
    	System.out.println(name);
    }

    @Then("^display chat details of loged in user$")
    public void display_chat_details_of_loged_in_user() throws Throwable {
        System.out.println("Display chat details of logged user");
    }

    @Then("^Display people details for adding into chat group$")
    public void display_people_details_for_adding_into_chat_group() throws Throwable {
        System.out.println("Display people details for adding into chat group");
    }

    @Then("^it should short out the names in the chatbox list$")
    public void it_should_short_out_the_names_in_the_chatbox_list() throws Throwable {
        System.out.println("it should short out the names in the chatbox list");
    }

    @And("^check the selected people is added$")
    public void check_the_selected_people_is_added() throws Throwable {
       System.out.println("check the selected people is added");
    }

    @And("^check the enter name are display in the list$")
    public void check_the_enter_name_are_display_in_the_list() throws Throwable {
       System.out.println("check the enter name are display in the list");
    }
}