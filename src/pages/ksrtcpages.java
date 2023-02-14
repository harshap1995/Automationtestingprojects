package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ksrtcpages {
	WebDriver driver;
	By eticket=By.xpath("//*[@id=\"navbarCollapse\"]/ul/li[2]/a");
	By booking=By.xpath("/html/body/main/a/section");
	
	
	
	public ksrtcpages(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void eticketdetails()
	{
		driver.findElement(eticket).click();
	}
	public void bookingdetails()
	{
		driver.findElement(booking).click();
		
	}

}
