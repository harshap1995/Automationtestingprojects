package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.ksrtcpages;

public class ksrtctest {
	
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.keralartc.com/main.html");
		
	}
	@Test
	public void test1()
	{
		ksrtcpages ob=new ksrtcpages(driver);
		//ob.bookingdetails();
		ob.eticketdetails();
		
		
		
	}

}
