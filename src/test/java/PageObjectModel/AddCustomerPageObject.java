package PageObjectModel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPageObject {

	WebDriver driver;

	private By login = By.xpath("//button[@type='submit']");
	private By search = By.xpath("//div[@id='search-box']//span//input");
	private By listIt = By.xpath("//div[@id='user-selection'][1]//h5");
	// private By customerList=By.xpath("//li[@class='nav-item has-treeview
	// menu-open']//a[@class='nav-link'][1]");
	private By addCustomer = By.xpath("//a[@class='nav-link']//p[text()=' Customers']");
	private By AddNewCustomer = By.xpath("//i[@class='fas fa-plus-square']");

	// Fill form
	private By email = By.id("Email");
	private By pass = By.id("Password");
	private By fname = By.id("FirstName");
	private By lname = By.id("LastName");
	private By gendr = By.id("Gender_Female");
	private By DOB = By.id("DateOfBirth");
	private By company = By.id("Company");
	private By tax = By.id("IsTaxExempt");
	private By NewsLetter = By.xpath("//div[@class='k-widget k-multiselect k-multiselect-clearable'][1]");
	private By select1 = By.xpath("By.xpath(\"//select[@id='SelectedNewsletterSubscriptionStoreIds']//option[2]");
	private By companyRole = By.xpath("//input[@class='k-input k-readonly']");
	private By vender = By.id("VendorId");
	private By active = By.id("//input[@id='Active']");
	private By AdminCommnet = By.id("AdminComment");
	private By Save = By.xpath("//i[@class='far fa-save'][1]");
	private By alert = By.xpath("//div[@class='alert alert-success alert-dismissable']");

	public AddCustomerPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickMe() {
	//	driver.findElement(login).click();
		WebElement e = driver.findElement(search);
		e.sendKeys("Customers");
		List<WebElement> list = driver.findElements(By.xpath("//div[@id='user-selection']"));

		for (int i = 0; i < list.size(); i++) {
			String text = list.get(i).getText();
			if (text.endsWith("Customers")) {
				driver.findElement(listIt).click();
				break;
			}
		}

		driver.findElement(AddNewCustomer).click();

	}

	public void setEmail(String Email)
	{
		driver.findElement(email).sendKeys(Email);
	}
	
	public void addInfo() throws InterruptedException {
		
		driver.findElement(pass).sendKeys("Swami123");
		driver.findElement(fname).sendKeys("Pooja");
		driver.findElement(lname).sendKeys("Shelake");
		driver.findElement(gendr).click();
		driver.findElement(DOB).sendKeys("10/02/1999");
		driver.findElement(company).sendKeys("Axenon consultancy pvt lmt pune");
		driver.findElement(tax).click();
		Thread.sleep(3000);

		/*
		 * driver.findElement(NewsLetter).click();
		 * 
		 * List<WebElement> listStore = driver.findElements(NewsLetter); for (int i = 0;
		 * i < listStore.size(); i++) {
		 * 
		 * String text = listStore.get(i).getText();
		 * 
		 * if (text.equals("Test store 2")) { driver.findElement(select1).click();
		 * 
		 * break; } }
		 */

		driver.findElement(AdminCommnet).sendKeys("Yes Im ready to logined in");

	}

	public void submitForm() {
		driver.findElement(Save).click();
	}

	public void confirmation() {
		String text = driver.findElement(alert).getText();

		System.out.println(text);
		
		
	}


}


