package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	
	ChromeDriver driver=new ChromeDriver();
	
	@Before
	public void setup()
	{
		
		driver.get("http://google.com");
	}
	@Test
	public void testdetails()
	{
		String str=driver.getTitle();
		System.out.println(str);
		
	}
	@After
	public void closedetails()
	{
		driver.quit();
	}
}
