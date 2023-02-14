package junit;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediffdropdown {
	//private static final WebElement WebElement = null;
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void setup()
	{
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void  test1()
	{
		//Select select = new Select(WebElement webelement);
		//driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]")).sendKeys("02");
		//driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]")).sendKeys("FEB");
		//driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]")).sendKeys("2004");
		WebElement day=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select s=new Select(day);
		s.selectByVisibleText("01");
		WebElement month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select s1=new Select(month);
		s1.selectByVisibleText("JAN");
		WebElement year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		Select s2=new Select(year);
		s2.selectByVisibleText("2004");
		
		List<WebElement> li=s.getOptions();
		System.out.println("day size:"+li.size());
		List<WebElement> lin=s1.getOptions();
		System.out.println("month size:"+lin.size());
		List<WebElement> link=s2.getOptions();
		System.out.println("year size:"+link.size());
	


	}
}
