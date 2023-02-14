package testNGpackge;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGdemo1 {
	ChromeDriver driver=new ChromeDriver();

	@BeforeTest
	public void setup()
	{
		driver.get("http://www.facebook.com");	}
	@BeforeMethod
	public void beforemethoddetails()
	{
		//activities
	}
	@Test(priority=1,invocationCount=2,dependsOnMethods= {"test2"},enabled=false)
	public void test1()
	{
		String str=driver.getTitle();
		System.out.println("Title is:"+str);
	}
	@Test(priority=2)
	public void test2()
	{
		String s=driver.getCurrentUrl();
		System.out.println("current url:"+s);
	}
	@AfterMethod
	public void aftermethoddetails()
	{
		
	}
	@AfterTest
	public void afterdetails()
	{
		
	}
}
