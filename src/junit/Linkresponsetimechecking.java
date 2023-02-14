package junit;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//important interview question

public class Linkresponsetimechecking {
	WebDriver driver;
	String s="http://www.facebook.com";
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(s);
	}
	@Test
	public void test1()
	{
		List<WebElement> l=driver.findElements(By.tagName("a"));
		System.out.println("total no of links:"+l.size());
		for(WebElement li:l)
		{
			String link=li.getAttribute("href");
			//method created for link verification
			verify(link);
			
		}
	}
	private void verify(String link) {
		//exception handled in the case of ny link issues happens
		try
		{
			URL u=new URL(link);
			//casting of class HttpURLConnection from URLConnection class
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			con.connect();
			if(con.getResponseCode()==200)
			{
				System.out.println("status code 200----"+link);
			}
			else if(con.getResponseCode()==404)
			{
				System.out.println("status code 404----"+link);
			}
			else
			{
				System.out.println("other status code 404----"+link);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	
		
	}

}
