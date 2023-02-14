package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsdemo {
	ChromeDriver driver=new ChromeDriver();
	
	@Before
	public void beforedetails()
	{
			driver.get("http://facebook.com");
		
	}
	@Test
	public void test1()
	{
		driver.findElement(By.id("email")).sendKeys("avc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("abc");
		driver.findElement(By.name("login")).click();
		
		
		
	}

}
