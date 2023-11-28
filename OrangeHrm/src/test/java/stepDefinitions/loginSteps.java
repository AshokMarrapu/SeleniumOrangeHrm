package stepDefinitions;
import io.cucumber.java.*;
import io.cucumber.java.en.*;
import utilities.myHooks;

public class loginSteps {

	@Before
	public void setup() {
		System.out.println(" ***Chrome browser is opened***");
	}

	@After
	public void teardown() {
		System.out.println(" ***Chrome browser is closed***");
	}

	@Given("^User is on Login page of Orange Hrm application$")
	public void user_is_on_login_page_of_orange_hrm_application() {
		/*
		 * //set configurations System.setProperty("webdriver.chrome.driver",
		 * "drivers/chromedriver.exe"); WebDriver driver = new ChromeDriver ();
		 * driver.get("http://127.0.0.1/orangehrm-2.6/index.php");
		 */
		System.out.println("--> User is on login page");
	}

	@When("User enters correct username as {string} and password as {string}")
	public void user_enters_correct_username_as_and_password_as(String username, String password) {
		// driver.findElement(By.name(username)).sendKeys("admin");

		System.out.println("--> User enters correct username and password " + username + " and " + password);
	}

	@When("^Click on Login button$")
	public void click_on_login_button() {
		System.out.println("--> User clicks on login button");
	}

	@Then("^User should login successfully$")
	public void user_should_login_successfully() {
		System.out.println("--> User log into application");
	}

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
