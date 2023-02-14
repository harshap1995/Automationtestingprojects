package junit;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Logofindingreddif {
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void beforetest()
	{
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test()
	public void test1()
	{
		Boolean b=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
		if(b)
			
			System.out.println("logo displayed");
		
		else
			System.out.println("logo is not displayed");
		
	}

}
