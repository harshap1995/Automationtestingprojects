package testNGpackge;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rightanddoubleclickpgm {
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	
	@Test(priority=1)
	public void test1()
	{
		
		Actions act=new Actions(driver);
		WebElement w2=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(w2);
		act.perform();
		Alert a=driver.switchTo().alert();
		String s=a.getText();
		
	
		
		if(s.equals("You double clicked me.. Thank You.."))
		{
			System.out.println("match");
		}
		else
			System.out.println("do not match");
		a.accept();
		
			
		
	
		
	}
	@Test(priority=0)
	public void test2()
	{
		Actions act1=new Actions(driver);
		WebElement w1=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		act1.contextClick(w1);
		WebElement w=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[3]"));
		act1.moveToElement(w).click();
		act1.perform();
		Alert b=driver.switchTo().alert();
		b.accept();
		
	}
	

}
