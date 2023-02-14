package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.fbloginpage;

public class fblogintest {
	
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("http://facebook.com");
	}
	@Test
	public void test1()
	{
		fbloginpage ob=new fbloginpage(driver);
		ob.setvalues("harsha", "123");
		ob.logindetails();
		
		
		
	}

}
