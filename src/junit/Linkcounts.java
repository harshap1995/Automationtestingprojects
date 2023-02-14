package junit;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcounts {
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void beforetest()
	{
		driver.get("http://www.facebook.com");
	}
	@Test()
	public void test1()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("Total no of links="+li.size());
		for(WebElement element:li)
		{
			System.out.println(element.getAttribute("href"));
		}
		
		
	}
	

}
