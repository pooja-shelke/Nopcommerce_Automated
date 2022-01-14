package PageObjectModel;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchCustomerPage {

	WebDriver driver;

	private By email=By.id("SearchEmail");
	private By search=By.xpath("//button[@id='search-customers']");
	
	private By data=By.xpath("//tr[@class='odd']//td[2]");
	
	public SearchCustomerPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void serachBy_Email(String e)
	{
		driver.findElement(email).sendKeys(e);
	}
	
	public void submit() {
		driver.findElement(search).click();
	}
	
	public void searchedData()
	{
		
		
		boolean text=driver.findElement(data).isDisplayed();
		
		if(text==true)
		{
			System.out.println("User is displyed");
			
		}
		else
		{
			System.out.println("User is displyed");
		}

		System.out.println(text);
	}
	
}
