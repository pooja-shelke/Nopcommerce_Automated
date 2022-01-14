package stepdef;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModel.AddCustomerPageObject;
import PageObjectModel.LoginPage;
import PageObjectModel.SearchCustomerPage;
import StepDefinition.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definations extends BaseClass {

	String generateEmail = randomstring() + "@gmail.com";

	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "/home/shelke/Documents/VI/Selenium_Akash/Driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		l = new LoginPage(driver);
		a = new AddCustomerPageObject(driver);
		s = new SearchCustomerPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String string) {
		driver.navigate().to("https://admin-demo.nopcommerce.com/login");
	}

	@When("Click on login")
	public void click_on_login() {
		l.clickSubmit();

	}

	@Then("User can viwe dashboard")
	public void user_can_viwe_dashboard() {
		System.out.println(driver.getTitle());
	}

	@When("User Click on Customer Menu")
	public void user_click_on_customer_menu() {
		a.clickMe();
	}

	@When("Click on Customer Menu Item")
	public void click_on_customer_menu_item() {

	}

	@When("Click on Add new button")
	public void click_on_add_new_button() {

	}

	@Then("User can view add new customer page")
	public void user_can_view_add_new_customer_page() {

	}

	@When("User Enter Customer Info")
	public void user_enter_customer_info() throws InterruptedException {

		a.setEmail(generateEmail);
		a.addInfo();

	}

	@When("Click on Save button")
	public void click_on_save_button() {
		a.submitForm();
	}

	@Then("can view Confirmation message")
	public void can_view_confirmation_message() {
		a.confirmation();
	}

	@Then("Navigate back")
	public void navigate_back() throws InterruptedException {

		Thread.sleep(3000);
	}

	@Then("Search Customer using email,fname,lname")
	public void search_customer_using_email_fname_lname() {
		s.serachBy_Email(generateEmail);
		s.submit();
		s.searchedData();
	}

	@Then("close browser")
	public void close_browser() {
		 driver.close();
	}

}
