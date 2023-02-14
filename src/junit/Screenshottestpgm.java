package junit;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;

public class Screenshottestpgm {
ChromeDriver driver=new ChromeDriver();
	@Before
	public void setup()
	{
		driver.get("file:///D:/programs/alert.html");
	}
	@Test
	public void test1() throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("D://screenshot2.png"));
		
		WebElement button=driver.findElement(By.xpath("/html/body/input[1]"));
		File sc=button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(sc, new File("./screenshot/error1.png"));
		
		
	}

}
