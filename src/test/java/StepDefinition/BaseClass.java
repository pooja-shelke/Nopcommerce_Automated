package StepDefinition;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import PageObjectModel.AddCustomerPageObject;
import PageObjectModel.LoginPage;
import PageObjectModel.SearchCustomerPage;

public class BaseClass {

	public  WebDriver driver;
	public LoginPage l;
	public AddCustomerPageObject a;
	public SearchCustomerPage s;
	
	public static String randomstring()
	{
		String randomString1=RandomStringUtils.randomAlphabetic(10);
	
		return randomString1;
		
	}
}
