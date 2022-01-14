package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	private By email=By.id("Email");
	private  By password=By.id("Password");
	private By submit=By.xpath("//button[@type='submit']");
	private By logout=By.xpath("//a[@class='nav-link' and text()='Logout']");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void enterEmail(String e)
	{
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys(e);
	}
	
	public void enterPasword(String p)
	{
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(p);
	}
	
	public void clickSubmit()
	{
		driver.findElement(submit).click();
	}
	
	public void logout()
	{
		driver.findElement(logout).click();
	}
	
}
