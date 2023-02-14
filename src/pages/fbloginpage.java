package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fbloginpage {
	WebDriver driver;
	By emailid1=By.id("email");
	By pass=By.id("pass");
	By logindetails=By.className("login");
	
	//constructor
	public fbloginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalues(String emailid,String password)
	{
		driver.findElement(emailid1).sendKeys(emailid);
		driver.findElement(pass).sendKeys(password);
		
	}
	public void logindetails()
	{
		driver.findElement(By.name("login")).click();
	}

}
