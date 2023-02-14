package testNGpackge;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Redifftesting {
	
	WebDriver driver=new ChromeDriver();
	@BeforeTest
	public void setup()
	{
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test(priority=1)
	public void logochecking()
	{
		Boolean b=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
		if(b)
		{
			System.out.println("logo is present");
		}
		else
		{
			System.out.println("logo is not present");
		}
	}
	@Test(priority=0)
	public void valuepassing()
	{
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("harsha");
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("harsha12345");
		String s=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).getAttribute("value");
		if(s.equalsIgnoreCase("check available"))
		{
			System.out.println("check available pass");
		}
		else
		{
			System.out.println("check available fail");
		}
		driver.findElement(By.xpath("//*[@id=\"newpasswd\"]")).sendKeys("harsha123");
		String pass=driver.findElement(By.xpath("//*[@id=\"newpasswd\"]")).getText();
		System.out.println(pass);
		driver.findElement(By.xpath("//*[@id=\"newpasswd1\"]")).sendKeys("harsha123");
		String conpass=driver.findElement(By.xpath("//*[@id=\"newpasswd1\"]")).getText();
		System.out.println(conpass);
		if(pass.equals(conpass))
		{
			System.out.println("password match");
		}
		else
		{
			System.out.println("password do not match");
		}
		driver.findElement(By.xpath("//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input")).sendKeys("harsha123@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"mobno\"]")).sendKeys("985476879");
		WebElement day=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select se=new Select(day);
		se.selectByVisibleText("01");
		WebElement month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select s1=new Select(month);
		s1.selectByVisibleText("JAN");
		WebElement year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		Select s2=new Select(year);
		s2.selectByVisibleText("2004");
		Boolean b=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isSelected();
		if(b)
			System.out.println("selected");
		else
			System.out.println("not selected");
		WebElement country1=driver.findElement(By.xpath("//*[@id=\"country\"]"));
		Select strr=new Select(country1);
		strr.selectByVisibleText("Aruba");
		String g=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[30]/td[2]/img")).getAttribute("chr");
		System.out.println("captcha:"+g);
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[32]/td[3]/input")).sendKeys("MK4Y");
		driver.findElement(By.id("Register")).click();
		
		
		
	
	}
	@Test(priority=3)
	public void textmatching()
	{
		String a=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[1]/td")).getText();
		if(a.equals("Create a Rediffmail account"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fails");
		}
	}
	@Test
	public void checkboxselecting()
	{
	Boolean c=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).isSelected();
	if(c)
	{
		System.out.println("checkbox is selected");
	}
	else
	{
		System.out.println("checkbox is not selected");
	}
	}
	@Test(priority=4)
	public void countrycode()
	{
		WebElement country=driver.findElement(By.xpath("//*[@id=\"country\"]"));
		Select s=new Select(country);
		List<WebElement> li=s.getOptions();
		System.out.println("country count:"+li.size());
		if(li.size()==50)
		{
			System.out.println("correct count");
		}
		else
		{
			System.out.println("not correct count");
		}
		
		
	}

}
