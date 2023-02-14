package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffradiobutton {
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void setup()
	{
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test1()
	{
		Boolean b=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isSelected();
		if(b)
			System.out.println("selected");
		else
			System.out.println("not selected");
		
		
	}

}
