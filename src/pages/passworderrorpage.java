package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class passworderrorpage {
	
	WebDriver driver;
	By mob=By.xpath("//*[@id=\"identify_email\"]");
	By search=By.id("did_submit");
	By cancel=By.xpath("//*[@id=\"identify_yourself_flow\"]/div/div[3]/div/div[1]/a");
	
	
	public passworderrorpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	
	public void setvalue(String phone)
	{
		driver.findElement(mob).sendKeys(phone);
		
	}
	public void searchdetails()
	{
		driver.findElement(By.xpath("//*[@id=\"identify_email\"]")).click();
	}
	public void canceldetails()
	{
		driver.findElement(By.xpath("//*[@id=\\\"identify_yourself_flow\\\"]/div/div[3]/div/div[1]/a")).click();
	}
	

}
