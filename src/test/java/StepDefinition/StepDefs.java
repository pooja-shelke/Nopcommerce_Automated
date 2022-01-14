package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModel.AddCustomerPageObject;
import PageObjectModel.LoginPage;
import PageObjectModel.SearchCustomerPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefs extends BaseClass {
	
	@Given("User launch crome browser")
	public void user_launch_crome_browser() {

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

	@When("User opens URL\"https:\\/\\/admin-demo.nopcommerce.com\\/login\"")
	public void user_opens_url_https_admin_demo_nopcommerce_com_login() {
		driver.navigate().to("https://admin-demo.nopcommerce.com/login");
	}

	@Then("Enter email as {string} and password as {string}")
	public void enter_email_as_and_password_as(String string, String string2) {
		l.enterEmail(string);
		l.enterPasword(string2);

	}

	@Then("Click on login")
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

	@Then("Search Customer using email,fname,lname")
	public void search_customer_using_email_fname_lname() {
		String uniqemail=randomstring()+"@gmail.com";
		System.out.println("Unique mail is "+uniqemail);
		s.serachBy_Email(uniqemail);
		s.submit();
		s.searchedData();
	}

	@Then("Close browser")
	public void close_browser() {
		driver.close();

	}

}
