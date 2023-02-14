package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazoniinpgm {
	
	ChromeDriver driver=new ChromeDriver();
	
	@Before
	public void testcase1()
	{
		driver.get("http://www.amazon.in");;
	}
	@Test
	public void testcase2()
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='nav-xshop']/a[5]")).click();
		
		driver.findElement(By.xpath("//*[@class='nav-cart-icon nav-sprite']")).click();
		driver.findElement(By.xpath("//*[@class='hm-icon nav-sprite' ]")).click();
		driver.findElement(By.xpath("//*[@id='nav-tools']/a[2]")).click();
		driver.findElement(By.id("ap_email")).sendKeys("abc@gmail.com");
		
		driver.navigate().back();
		driver.navigate().back();
		
		
	}
	

}
