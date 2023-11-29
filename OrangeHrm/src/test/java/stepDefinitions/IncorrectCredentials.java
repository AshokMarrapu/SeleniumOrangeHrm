package stepDefinitions;
import io.cucumber.java.en.*;

public class IncorrectCredentials {

@Given("^User is on Login page of application$")
public void user_is_on_login_page_of_application() {
	System.out.println("--> User is on login page 2nd time");
}

@When("User enters incorrect username as {string} and password as {string}")
public void user_enters_incorrect_username_as_and_password_as(String username, String password) {
	System.out.println("--> User enters invalid username and password " + username + " and " + password);
}

@Then("User should get an error message is as {string}")
public void user_should_get_an_error_message_is_as(String message) {
	System.out.println("--> User should get error message");
}
}

