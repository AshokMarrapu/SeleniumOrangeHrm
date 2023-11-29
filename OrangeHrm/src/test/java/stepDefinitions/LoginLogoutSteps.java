package stepDefinitions;

import io.cucumber.java.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import java.util.concurrent.TimeUnit;

public class LoginLogoutSteps {
	public WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\marra\\git\\SeleniumOrangeHrmRepository\\OrangeHrm\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");

		System.out.println(" ***Chrome browser is opened***");
	}

	@After
	public void teardown() {

		driver.quit();
		System.out.println(" ***Chrome browser is closed***");
	}

	@Given("^User is on Login page of Orange Hrm application$")
	public void user_is_on_login_page_of_orange_hrm_application() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("--> User is on login page");
	}

	@When("User enters correct username as {string} and password as {string}")
	public void user_enters_correct_username_as_and_password_as(String username, String password) throws Throwable {
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		System.out.println("--> User enters correct username and password " + username + " and " + password);
	}

	@When("^Click on Login button$")
	public void click_on_login_button() throws Exception {
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		System.out.println("--> User clicks on login button");
	}

	@Then("^User should login successfully$")
	public void user_should_login_successfully() {
		System.out.println("--> User log into application");
	}

	@Given("User is on home page of Orange Hrm application")
	public void user_is_on_home_page_of_orange_hrm_application() throws Exception {
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		System.out.println("--> User is on home page");
	}

	@When("User clicks on Logout button")
	public void user_clicks_on_logout_button() throws Exception {
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("--> User clicks on logout button");
		Thread.sleep(3000);
	}

	@Then("User should logout successfully")
	public void user_should_logout_successfully() {
		System.out.println("--> User logs out from the application");
	}
}