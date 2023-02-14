package testNGpackge;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datapickerpgm {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("http://expedia.com");
		driver.manage().window().maximize();
		
		
		
	}
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("//*[@id=\"wizardMainRegionV2\"]/div/div/div/div/ul/li[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"d1-btn\"]")).click();
		while(true)
		{
			WebElement month=driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/h2"));
			String month1=month.getText();
			System.out.println(month1);
			
			if(month1.equals("October 2023"))
			{
				System.out.println(month1);
			    break;
			}	
			else
			{
				driver.findElement(By.xpath("//*[@class='uitk-calendar']/div/button[2]")).click();
			}
		}
	List<WebElement> alldates=driver.findElements(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr/td/button"));
			
	for(WebElement datevalue:alldates)
	{
			String date=datevalue.getAttribute("data-day");
			System.out.println(date);
			if(date.equals("18"))
			{
				datevalue.click();
				System.out.println("date selected");
				driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div/button")).click();
			}
			
	}

		
		
	
		
	}
	

}
