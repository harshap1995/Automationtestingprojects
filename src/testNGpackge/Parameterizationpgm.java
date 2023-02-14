package testNGpackge;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterizationpgm {
	
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@Parameters("searchvalue")
	@Test
	public void test1(String s)
	{
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys(s,Keys.ENTER);
		
		
		}

}
