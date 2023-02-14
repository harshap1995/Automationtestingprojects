package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;


public class Alertpgm {
	
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void setup()
	{
		driver.get("file:///C:/Users/user/Downloads/alert.html");;
		
	}
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		if(alerttext.equals("Hello I am an alert box!!"))
		{
			System.out.println("match");
		}
		else
			System.out.println("do not match");
		a.accept();
		driver.findElement(By.name("firstname")).sendKeys("harsha");
		driver.findElement(By.name("lastname")).sendKeys("manoharan");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
	}

}
