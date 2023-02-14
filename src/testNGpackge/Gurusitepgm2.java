package testNGpackge;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gurusitepgm2 {
	WebDriver driver=new ChromeDriver();
	@BeforeTest
	public void setup()
	{
		driver.get("https://demo.guru99.com/popup.php");
	}
	@Test
	public void test1()
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		String parentwindow=driver.getWindowHandle();
		WebElement element=driver.findElement(By.xpath("/html/body/p/a"));
		element.click();
		//can't store handle details in string..so using set here.
		Set<String> subwindow=driver.getWindowHandles();
		for(String handle:subwindow)
		{
			System.out.println(handle);
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abc@gmail.com");
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
				
				driver.close();
			}
			driver.switchTo().window(parentwindow);
		}
		
		
		
		
	}

}
