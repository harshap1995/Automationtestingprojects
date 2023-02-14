package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.passworderrorpage;

public class passworderrortest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("http:facebook.com");
	}
	@Test
	public void test1()
	{
		passworderrorpage ob=new passworderrorpage(driver);
		ob.setvalue("8943758834");
		
		
		
	}

}
