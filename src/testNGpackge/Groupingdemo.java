package testNGpackge;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Groupingdemo {
	ChromeDriver driver=new ChromeDriver();

	@BeforeTest
	public void setup()
	{
		driver.get("http://www.facebook.com");	
	}
	@BeforeMethod
	public void beforemethoddetails()
	{
		System.out.println("hi hello");
	}
	@Test(groups={"smoke"})
	public void test1()
	{
		//String str=driver.getTitle();
		//System.out.println("Title is:"+str);
		System.out.println("hi hello hi");
	}
	@Test(groups={"smoke"})
	public void test2()
	{
		//String s=driver.getCurrentUrl();
		System.out.println("hi");
	}
	@Test(groups={"regression"})
	public void test3()
	{
		System.out.println("hello");
	}
	@AfterMethod
	public void aftermethoddetails()
	{
		
	}

}
