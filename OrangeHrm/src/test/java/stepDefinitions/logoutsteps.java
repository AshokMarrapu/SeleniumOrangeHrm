package stepDefinitions;

import io.cucumber.java.en.*;

public class logoutsteps {
	@Given("User is on home page of Orange Hrm application")
	public void user_is_on_home_page_of_orange_hrm_application() {
		System.out.println("--> User is on home page");
	}

	@When("User clicks on Logout button")
	public void user_clicks_on_logout_button() {
		System.out.println("--> User clicks on logout button");
	}

	@Then("User should logout successfully")
	public void user_should_logout_successfully() {
		System.out.println("--> User logs out from the application");
	}
}
