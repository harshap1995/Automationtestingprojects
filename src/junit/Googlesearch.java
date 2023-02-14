package junit;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void beforetest()
	{
		driver.get("http://www.google.com");
	}
	@Test()
	public void test1()
	{
		driver.findElement(By.name("q")).sendKeys("phone");
		driver.findElement(By.name("btnK")).click();
		
	}
	

}
